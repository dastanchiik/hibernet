package org.example;

import org.example.model.Student;
import org.example.repository.StudentImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Student st = new Student("qwdfed",12);
        StudentImpl impl = new StudentImpl();
        impl.deleteAll();
    }
}
