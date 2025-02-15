package com.Regex.BasicRegexProblems.ValidateLicensePlateNumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter license plate number
        System.out.println("Enter license plate number: ");
        String userName = scanner.next();

        // Define the regex pattern for a valid license plate number
        String regex = "^[A-Z]{2}[0-9]{4}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the user input against the pattern
        Matcher matcher = pattern.matcher(userName);

        // Check if the license plate number matches the pattern
        if(matcher.matches()){
            System.out.println("License plate number is valid");
        }
        else{
            System.out.println("Invalid License plate number");
        }
    }
}
