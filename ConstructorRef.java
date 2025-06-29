package org.example;

import java.util.List;

public class ConstructorRef {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<Student> students = names.stream()
                .map(Student::new) // Using constructor reference to create Student objects
                .toList(); // Collecting the results into a List
        students.forEach(System.out::println); // Printing each Student object
    }
}
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}
