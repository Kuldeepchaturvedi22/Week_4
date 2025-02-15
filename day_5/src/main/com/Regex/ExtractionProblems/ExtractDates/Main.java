package com.Regex.ExtractionProblems.ExtractDates;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter string: ");
        String inputString = scanner.nextLine();

        // Define the regex pattern for a valid dates
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher to find dates in the input string
        Matcher matcher = pattern.matcher(inputString);

        // Iterate over all matches and print each date
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}