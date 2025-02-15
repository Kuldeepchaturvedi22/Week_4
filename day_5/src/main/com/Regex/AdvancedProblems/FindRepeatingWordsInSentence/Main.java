package com.Regex.AdvancedProblems.FindRepeatingWordsInSentence;

import java.util.regex.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Regular expression to find repeating words
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        // Set to store unique repeating words
        Set<String> repeatingWords = new HashSet<>();

        // Find all repeating words
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }

        // Print the repeating words
        for (String word : repeatingWords) {
            System.out.println(word);
        }
    }
}