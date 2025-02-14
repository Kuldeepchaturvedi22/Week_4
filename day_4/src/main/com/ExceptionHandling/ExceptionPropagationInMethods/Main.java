package com.ExceptionHandling.ExceptionPropagationInMethods;

public class Main {
    public static void method1() {
        // This method throws an ArithmeticException
        System.out.println(10 / 0);
    }

    public static void method2() {
        // This method calls method1()
        method1();
    }

    public static void main(String[] args) {
        try {
            // This method calls method2() and handles the exception
            method2();
        } catch (ArithmeticException e) {
            // Handle the exception and print the message
            System.out.println("Handled exception in main");
        }
    }
}