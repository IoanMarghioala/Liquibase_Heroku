package com.example.capgemini.liquibase.controller;

import com.example.capgemini.liquibase.entity.dto.PersonDTO;
import com.example.capgemini.liquibase.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping()
    public ResponseEntity<PersonDTO> postPerson(@RequestBody PersonDTO personDTO){
        return new ResponseEntity<>(personService.addPerson(personDTO), HttpStatus.CREATED);
    }
}
