package com.dovalle.api.service;

import com.dovalle.api.dto.response.MessageResponseDTO;
import com.dovalle.api.entity.Person;
import com.dovalle.api.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private final PersonRepository personRepository;

    public MessageResponseDTO create(Person personDTO) {
        var person = personDTO;//delete this line
        //Person person = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(person);

        MessageResponseDTO messageResponse = this.createMessageResponse("Person successfully created with ID ", savedPerson.getId());

        return messageResponse;
    }

    private MessageResponseDTO createMessageResponse(String simpleMessage, Long idKey) {
        return MessageResponseDTO.builder()
                .message(simpleMessage + idKey)
                .build();
    }
}
