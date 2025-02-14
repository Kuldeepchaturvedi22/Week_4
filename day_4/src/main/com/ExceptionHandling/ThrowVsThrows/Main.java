package com.ExceptionHandling.ThrowVsThrows;

import java.util.Scanner;

public class Main {
    // Method to calculate interest
    // Throws IllegalArgumentException if amount or rate is negative
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        // Check if amount or rate is negative
        if (amount < 0 || rate < 0) {
            // Throw an IllegalArgumentException if amount or rate is negative
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }

        // Calculate interest
        double interest = (amount * rate * years) / 100;
        return interest;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        // Prompt the user to enter the rate
        System.out.println("Enter rate: ");
        double rate = scanner.nextDouble();

        // Prompt the user to enter the number of years
        System.out.println("Enter years: ");
        int years = scanner.nextInt();

        try {
            // Calculate and print the interest
            System.out.println("Your interest is " + calculateInterest(amount, rate, years));
        } catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException and display the message
            System.out.println(e.getMessage());
        }
    }
}