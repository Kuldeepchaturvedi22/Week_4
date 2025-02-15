package com.Regex.AdvancedProblems.ExtractCurrencyValuesFromText;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        // Define the regex pattern to match currency values
        // The pattern matches optional dollar sign followed by digits, a dot, and more digits
        String regex = "\\$?\\d+\\.\\d+";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher to find currency values in the input text
        Matcher matcher = pattern.matcher(text);

        // Iterate over all matches and print each currency value found
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
    }
}