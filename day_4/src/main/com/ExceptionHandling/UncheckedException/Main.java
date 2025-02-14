package com.ExceptionHandling.UncheckedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        try {
            // Prompt the user to enter the first number
            System.out.println("Enter first number: ");
            int firstNumber = scanner.nextInt();

            // Prompt the user to enter the second number
            System.out.println("Enter second number: ");
            int secondNumber = scanner.nextInt();

            // Perform division and print the result
            System.out.println(firstNumber / secondNumber);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Number can not " + e.getMessage());
        } catch (InputMismatchException e) {
            // Handle non-numeric input exception
            System.out.println("You entered a non-numeric value " + e.getMessage());
        }
    }
}