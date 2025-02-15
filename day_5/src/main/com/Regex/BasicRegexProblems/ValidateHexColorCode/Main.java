package com.Regex.BasicRegexProblems.ValidateHexColorCode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter hex code
        System.out.println("Enter hex code: ");
        String userName = scanner.next();

        // Define the regex pattern for a valid hex code
        String regex = "^[#]{1}[a-fA-F0-9]{6}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the user input against the pattern
        Matcher matcher = pattern.matcher(userName);

        // Check if the hex code matches the pattern
        if(matcher.matches()){
            System.out.println("Hex code is valid");
        }
        else{
            System.out.println("Invalid hex code");
        }
    }
}
