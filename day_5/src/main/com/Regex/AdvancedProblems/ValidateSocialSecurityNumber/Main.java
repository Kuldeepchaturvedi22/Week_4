package com.Regex.AdvancedProblems.ValidateSocialSecurityNumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a Social Security Number
        System.out.println("Enter Social Security Number: ");
        String socialSecurityNumber = scanner.nextLine();

        // Define the regex pattern to extract numbers and hyphens
        String regexToGetNumber = "\\b[0-9-]+\\b";

        // Define the regex pattern to validate the SSN format (XXX-XX-XXXX)
        String regexToCheckSSN = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Compile the regex pattern to extract numbers and hyphens
        Pattern patternToGetNumber = Pattern.compile(regexToGetNumber);

        // Create a matcher to find numbers and hyphens in the input string
        Matcher matcherToGetNumber = patternToGetNumber.matcher(socialSecurityNumber);

        // Compile the regex pattern to validate the SSN format
        Pattern patternToCheckSSN = Pattern.compile(regexToCheckSSN);

        // Iterate over all matches of numbers and hyphens
        while (matcherToGetNumber.find()) {
            // Create a matcher to validate the extracted number against the SSN format
            Matcher matcherToCheckSSN = patternToCheckSSN.matcher(matcherToGetNumber.group());

            // Check if the extracted number matches the SSN format
            if (matcherToCheckSSN.matches()) {
                System.out.println(matcherToGetNumber.group() + " is valid");
            } else {
                System.out.println(matcherToGetNumber.group() + " is not valid");
            }
        }
    }
}