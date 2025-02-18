package com.Reflection.BasicLevel.GetClassInformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();

        try {
            // Get the Class object
            Class<?> clazz = Class.forName(className);

            // Display class name
            System.out.println("Class: " + clazz.getName());

            // Display constructors
            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : clazz.getConstructors()) {
                System.out.println(constructor);
            }

            // Display methods
            System.out.println("\nMethods:");
            for (Method method : clazz.getMethods()) {
                System.out.println(method);
            }

            // Display fields
            System.out.println("\nFields:");
            for (Field field : clazz.getFields()) {
                System.out.println(field);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }

        scanner.close();
    }
}