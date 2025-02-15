package com.Regex.ExtractionProblems.ExtractLinksFromWebPage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter string: ");
        String inputString = scanner.nextLine();

        // Define the regex pattern for a valid links
        String regex = "\\b(https|http)://(www\\.)?([a-zA-Z0-9.-]+)\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher to find links in the input string
        Matcher matcher = pattern.matcher(inputString);

        // Iterate over all matches and print each link
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}