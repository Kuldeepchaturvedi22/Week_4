package com.Reflection.BasicLevel.DynamicallyCreateObjects;

public class Student {
    // Private fields to store the student's ID and name
    private int id;
    private String name;

    // Constructor to initialize the student's ID and name
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to print the student's ID and name
    public void get() {
        System.out.println(id);
        System.out.println(name);
    }
}
