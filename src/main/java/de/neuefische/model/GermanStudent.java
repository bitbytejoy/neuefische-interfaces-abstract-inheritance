package de.neuefische.model;

public class GermanStudent extends Student {
    public GermanStudent(String name) {
        super(name);
    }

    @Override
    public String sayMajor () {
        return "German";
    }
}
