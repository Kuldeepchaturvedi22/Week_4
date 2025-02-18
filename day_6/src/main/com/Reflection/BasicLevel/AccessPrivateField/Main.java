package com.Reflection.BasicLevel.AccessPrivateField;

import java.lang.reflect.Field;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Create an instance of Person
            Person person = new Person(25);

            // Get the age field of the Person class
            Field ageField = Person.class.getDeclaredField("age");

            // Make the age field accessible
            ageField.setAccessible(true);

            // Retrieve the value of the age field
            int age = (int) ageField.get(person);
            System.out.println("Age before modification: " + age);

            // Modify the value of the age field
            ageField.set(person, 30);

            // Retrieve the modified value of the age field
            age = (int) ageField.get(person);
            System.out.println("Age after modification: " + age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
