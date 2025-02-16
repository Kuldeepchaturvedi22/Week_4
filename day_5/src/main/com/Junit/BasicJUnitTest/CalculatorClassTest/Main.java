package com.Junit.BasicJUnitTest.CalculatorClassTest;

public class Main {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract the second integer from the first
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide the first integer by the second
    // Throws an exception if the second integer is zero
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}