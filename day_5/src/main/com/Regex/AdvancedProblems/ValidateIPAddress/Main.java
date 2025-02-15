package com.Regex.AdvancedProblems.ValidateIPAddress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter string: ");
        String inputString = scanner.nextLine();

        // Define the regex pattern for a valid IPv4 address
        String regex = "\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher to find IPv4 addresses in the input string
        Matcher matcher = pattern.matcher(inputString);

        // Iterate over all matches and print each IPv4 address
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}