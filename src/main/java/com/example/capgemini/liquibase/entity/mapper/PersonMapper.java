package com.example.capgemini.liquibase.entity.mapper;

import com.example.capgemini.liquibase.entity.Person;
import com.example.capgemini.liquibase.entity.dto.PersonDTO;
import org.dozer.DozerBeanMapper;

public class PersonMapper {

    public static PersonDTO toPersonDTO (Person person){
        PersonDTO personDTO = new DozerBeanMapper().map(person,PersonDTO.class);
        return personDTO;
    }

    public static Person toPerson(PersonDTO personDTO){
        Person person = new DozerBeanMapper().map(personDTO, Person.class);
        return person;
    }
}
