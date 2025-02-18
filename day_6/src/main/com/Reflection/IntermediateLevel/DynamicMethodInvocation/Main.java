package com.Reflection.IntermediateLevel.DynamicMethodInvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create an instance of MathOperation with initial values
        MathOperation mathOperation = new MathOperation(2, 4);

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter method name: ");

        // Read the method name from user input
        String methodName = scanner.next();

        // Get the Class object of MathOperation
        Class<?> cls = mathOperation.getClass();

        // Get the Method object for the specified method name
        Method method = cls.getDeclaredMethod(methodName);

        // Invoke the method on the mathOperation instance and get the result
        int result = (int) method.invoke(mathOperation);

        // Print the result
        System.out.println("Result: " + result);
    }
}