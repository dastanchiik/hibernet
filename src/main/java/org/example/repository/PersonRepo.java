package org.example.repository;

import org.example.model.Student;

import java.util.List;

public interface PersonRepo {

    void save(Student student);

    Student getById(Long id);

    List getAll();

    void deleteAll();
}
