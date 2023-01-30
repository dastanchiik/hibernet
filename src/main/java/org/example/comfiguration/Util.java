package org.example.comfiguration;

import org.example.model.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class Util {
    private static SessionFactory sessionFactory;

    public Util() {
        sessionFactory = new Configuration()
                .setProperty(Environment.URL,"jdbc:postgresql://localhost:5432/postgres")
                .setProperty(Environment.PASS,",sql.11217S")
                .setProperty(Environment.USER,"postgres")
                .setProperty(Environment.HBM2DDL_AUTO,"create")
                .setProperty(Environment.SHOW_SQL,"true")
                .setProperty(Environment.DRIVER,"org.postgresql.Driver")
                .setProperty(Environment.DIALECT,"org.hibernate.dialect.PostgreSQL10Dialect")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
