package com.example.capgemini.liquibase.entity;

import lombok.*;

import javax.persistence.Entity;

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person {
    private int id;
    private String name;
    private int age;
}
