package com.Regex.ExtractionProblems.ExtractAllCapitalizedWordsFromSentence;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter string: ");
        String inputString = scanner.nextLine();

        // Define the regex pattern for capitalized words
        String regex = "\\b[A-Z][a-zA-Z]*\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher to find capitalized words in the input string
        Matcher matcher = pattern.matcher(inputString);

        // Iterate over all matches and print each capitalized word
        while (matcher.find()) {
            System.out.print(matcher.group()+", ");
        }
    }
}