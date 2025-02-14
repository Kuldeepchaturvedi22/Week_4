package com.ExceptionHandling.FinallyBlockExecution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        try {
            // Perform division
            int result = firstNumber / secondNumber;
            // Print the result
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the case where division by zero occurs
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Ensure this block is always executed
            System.out.println("Operation completed");
        }
    }
}