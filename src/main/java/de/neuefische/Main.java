package de.neuefische;

import de.neuefische.model.*;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new LazyDropOutStudent("Johnny"),
            new DropOutStudent("Bob"),
            new GermanStudent("Jenny"),
            new GeneralStudiesStudent("Tom"),
            new InformaticsStudent("R2D2")
        };

        for (Student student : students) {
            System.out.println(student.type());
            System.out.println(student.sayMajor());
        }
    }
}