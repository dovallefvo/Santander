package com.dovalle.api.service;

import com.dovalle.api.dto.mapper.PersonMapper;
import com.dovalle.api.dto.request.PersonDTO;
import com.dovalle.api.dto.response.MessageResponseDTO;
import com.dovalle.api.entity.Person;
import com.dovalle.api.exception.PersonNotFoundException;
import com.dovalle.api.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    public MessageResponseDTO create(PersonDTO personDTO) {
        Person person = personMapper.toEntity(personDTO);

        Person personToSave = personRepository.save(person);

        MessageResponseDTO messageResponse = this.createMessageResponse("Person successfully created with ID ", personToSave.getId());

        return messageResponse;
    }

    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
        return personMapper.toDTO(person);
    }

    public List<PersonDTO> listAll() {
        List<Person> people = personRepository.findAll();
        return people.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MessageResponseDTO update(Long id, PersonDTO personDTO) throws PersonNotFoundException {
        verifyPersonExists(id);

        Person updatedPerson = personMapper.toEntity(personDTO);
        Person personToUpdate = personRepository.save(updatedPerson);

        MessageResponseDTO messageResponse = createMessageResponse("Person successfully updated with ID ", personToUpdate.getId());

        return messageResponse;
    }

    public void delete(Long id) throws PersonNotFoundException {
        verifyPersonExists(id);

        personRepository.deleteById(id);
    }

    private MessageResponseDTO createMessageResponse(String simpleMessage, Long idKey) {
        return MessageResponseDTO.builder()
                .message(simpleMessage + idKey)
                .build();
    }

    private void verifyPersonExists(Long id) throws PersonNotFoundException {
        personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }
}
