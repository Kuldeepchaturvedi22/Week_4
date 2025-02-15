package com.Regex.AdvancedProblems.ExtractProgrammingLanguageNamesFromText;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        // List of programming languages to be extracted
        List<String> languageLists = Arrays.asList("Python", "JavaScript", "Java", "C#", "C++", "PHP", "Swift", "Ruby", "TypeScript", "Kotlin", "Go", "Rust", "R", "Objective-C", "Perl", "Scala", "Dart", "Haskell", "Lua", "Elixir", "Shell");

        // Iterate over each programming language in the list
        for (String language : languageLists) {
            // Define the regex pattern to match the programming language as a whole word
            String regex = "\\b" + language + "\\b";

            // Compile the regex pattern
            Pattern pattern = Pattern.compile(regex);

            // Create a matcher to find the programming language in the input text
            Matcher matcher = pattern.matcher(text);

            // Iterate over all matches and print each programming language found
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}