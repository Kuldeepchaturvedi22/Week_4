package com.ExceptionHandling.NestedTryCatchBlock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter values of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        System.out.println("Enter divisor: ");
        int divisor = scanner.nextInt();
        try {
            // Try to access the element at the given index
            int value = array[index];
            try {
                // Try to divide the element by the divisor
                System.out.println("Result when dividing the value at the given index by the divisor: " + (array[index] / divisor));
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid array index
            System.out.println("Invalid array index!");
        }
    }
}