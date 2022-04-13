package com.example.capgemini.liquibase.repository;

import com.example.capgemini.liquibase.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> { }
