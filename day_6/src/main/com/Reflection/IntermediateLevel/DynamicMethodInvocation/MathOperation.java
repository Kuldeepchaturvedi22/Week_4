package com.Reflection.IntermediateLevel.DynamicMethodInvocation;

public class MathOperation {
    // Private fields to store the first and second values
    private int firstValue;
    private int secondValue;

    // Constructor to initialize the first and second values
    public MathOperation(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    // Method to add the first and second values
    public int add() {
        return firstValue + secondValue;
    }

    // Method to subtract the second value from the first value
    public int subtract() {
        return firstValue - secondValue;
    }

    // Method to multiply the first and second values
    public int multiply() {
        return firstValue * secondValue;
    }
}