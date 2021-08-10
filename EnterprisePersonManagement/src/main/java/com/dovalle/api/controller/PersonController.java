package com.dovalle.api.controller;

import com.dovalle.api.dto.response.MessageResponseDTO;
import com.dovalle.api.entity.Person;
import com.dovalle.api.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/person")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private PersonRepository personRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson (@RequestBody Person personDTO){
        try {
            Person personSaved = this.personRepository.save(personDTO);
            return MessageResponseDTO
                    .builder()
                    .message("Person crated with sucess. ID: " + personSaved.getId())
                    .build();
        }
        catch (Exception e){
            return MessageResponseDTO
                    .builder()
                    .message("Error to create a person. " + e.getMessage() + "\n" + e.getCause())
                    .build();
        }

    }

}
