package com.Reflection.BasicLevel.DynamicallyCreateObjects;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the Class object associated with Student
            Class<?> cls = Class.forName("com.Reflection.BasicLevel.DynamicallyCreateObjects.Student");

            // Get the constructor with parameters int and String
            Constructor<?> constructor = cls.getConstructor(int.class, String.class);

            // Create an instance of Student using the constructor
            Object student = constructor.newInstance(1, "Ram");

            // Cast the object to Student and call the get method
            ((Student) student).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}