package com.ExceptionHandling.CustomException;

import java.util.Scanner;

public class Main {
    // Method to validate the age
    public static void validateAge(int age) throws InvalidAgeException {
        // Check if the age is less than 18
        if (age < 18) {
            // Throw an InvalidAgeException if age is less than 18
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            // Print access granted message if age is 18 or above
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter their age
        System.out.println("Enter your age: ");
        // Read the age entered by the user
        int age = scanner.nextInt();
        try {
            // Validate the entered age
            validateAge(age);
        } catch (InvalidAgeException e) {
            // Handle the custom exception and display the message
            System.out.println(e.getMessage());
        }
    }
}