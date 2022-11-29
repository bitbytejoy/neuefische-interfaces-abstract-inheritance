package de.neuefische.model;

public class DropOutStudent extends Student {
    public DropOutStudent(String name) {
        super(name);
    }

    public String type () {
        return "DropOutStudent";
    }
}
