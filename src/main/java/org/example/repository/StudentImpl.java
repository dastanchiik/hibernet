package org.example.repository;

import org.example.comfiguration.Util;
import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentImpl implements PersonRepo {
    private SessionFactory ses = Util.getSessionFactory();


    @Override
    public void save(Student student) {
        try (Session session = ses.openSession()) {
            session.save(student);
        }
    }

    @Override
    public Student getById(Long id) {
        try (Session session = ses.openSession()) {
            return session.get(Student.class, id);
        }
    }

    @Override
    public void deleteAll() {
        try (Session session = ses.openSession()) {
            session.createQuery("delete from Student st");
        }
    }
}
