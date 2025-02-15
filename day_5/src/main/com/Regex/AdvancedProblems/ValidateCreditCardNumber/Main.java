package com.Regex.AdvancedProblems.ValidateCreditCardNumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a card number
        System.out.println("Enter card number");
        String cardNumber = scanner.nextLine();

        // Define the regex pattern for a valid credit card number
        // The pattern matches a number starting with 4 or 5 followed by 15 digits
        String regex = "^[4-5]{1}[0-9]{15}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher to validate the card number against the pattern
        Matcher matcher = pattern.matcher(cardNumber);

        // Check if the card number matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid card number");
        } else {
            System.out.println("Invalid card number");
        }
    }
}