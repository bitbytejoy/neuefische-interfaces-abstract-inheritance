package de.neuefische.model;

public class InformaticsStudent extends Student {
    public InformaticsStudent(String name) {
        super(name);
    }

    @Override
    public String sayMajor () {
        return super.sayMajor() + "Test";
    }
}
