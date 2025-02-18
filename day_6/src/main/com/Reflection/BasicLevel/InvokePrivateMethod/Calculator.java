package com.Reflection.BasicLevel.InvokePrivateMethod;

public class Calculator {
    private int a;
    private int b;

    // Constructor to initialize the values of a and b
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Private method to multiply two integers
    private int multiply(int a, int b) {
        return a * b;
    }
}