package com.Junit.BasicJUnitTest.ExceptionHandlingTest;

public class Main {
    // Method to divide two integers
    // Throws an ArithmeticException if the divisor is zero
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}