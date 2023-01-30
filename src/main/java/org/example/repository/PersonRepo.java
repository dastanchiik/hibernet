package org.example.repository;

import org.example.model.Student;

public interface PersonRepo {

    void save(Student student);

    Student getById(Long id);

    void deleteAll();
}
