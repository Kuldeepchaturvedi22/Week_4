package com.Regex.ReplaceAndModifyStrings.ReplaceMultipleSpacesWithSingleSpace;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter string: ");
        String inputString = scanner.nextLine();

        // Replace multiple spaces with a single space
        String modifiedString = inputString.replaceAll("\\s+", " ");

        // Print the modified string
        System.out.println(modifiedString);
    }
}