package com.Reflection.BasicLevel.InvokePrivateMethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create an instance of Calculator with initial values
        Calculator calc = new Calculator(5, 5);

        // Get the Class object associated with Calculator
        Class<?> cls = calc.getClass();

        // Get the private method 'multiply' with two int parameters
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

        // Make the private method accessible
        method.setAccessible(true);

        // Invoke the method with arguments 5 and 10, and store the result
        int result = (int) method.invoke(calc, 5, 10);

        // Print the result of the method invocation
        System.out.println("Result: " + result);
    }
}