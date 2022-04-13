package com.example.capgemini.liquibase.service;

import com.example.capgemini.liquibase.entity.Person;
import com.example.capgemini.liquibase.entity.dto.PersonDTO;
import com.example.capgemini.liquibase.entity.mapper.PersonMapper;
import com.example.capgemini.liquibase.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonDTO addPerson(PersonDTO personDTO){
        Person person = personRepository.save(PersonMapper.toPerson(personDTO));
        return PersonMapper.toPersonDTO(person);
    }
}
