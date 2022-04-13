package com.example.capgemini.liquibase.entity.dto;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonDTO {
    private int id;
    private String name;
    private int age;
}
