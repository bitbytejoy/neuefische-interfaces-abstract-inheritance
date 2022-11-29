package de.neuefische.model;

public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    private String hello() {
        return "Hello";
    }

    public String sayMajor () {
        return "N/A";
    }

    public String type () {
        return "Student";
    }
}
