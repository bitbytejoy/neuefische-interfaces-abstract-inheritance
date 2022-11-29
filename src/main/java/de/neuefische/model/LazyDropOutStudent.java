package de.neuefische.model;

public class LazyDropOutStudent extends DropOutStudent {

    public LazyDropOutStudent(String name) {
        super(name);
    }

    public String type () {
        return "LazyDropOutStudent";
    }
}
