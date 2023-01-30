package org.example.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "people")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student() {

    }
}