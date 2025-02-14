package com.ExceptionHandling.MultipleCatchBlocks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();

        // Initialize the array with the specified size
        int[] array = new int[size];

        // Prompt the user to enter the values for the array
        System.out.println("Enter value of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Prompt the user to enter the index of the value they want to retrieve
        System.out.println("Enter the index which value you want: ");
        int index = scanner.nextInt();

        try {
            // Attempt to print the value at the specified index
            System.out.println("Value at index " + index + " : " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where the specified index is out of bounds
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            // Handle the case where the array is not initialized
            System.out.println("Array is not initialized!");
        }
    }
}