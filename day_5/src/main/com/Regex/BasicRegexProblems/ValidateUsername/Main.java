package com.Regex.BasicRegexProblems.ValidateUsername;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a username
        System.out.println("Enter user name: ");
        String userName = scanner.next();

        // Define the regex pattern for a valid username
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the user input against the pattern
        Matcher matcher = pattern.matcher(userName);

        // Check if the username matches the pattern
        if(matcher.matches()){
            System.out.println("User name is valid");
        }
        else{
            System.out.println("Invalid user name");
        }
    }
}