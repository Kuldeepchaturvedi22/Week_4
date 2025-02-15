package com.Regex.ReplaceAndModifyStrings.CensorBadWordsInSentence;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter string: ");
        String inputString = scanner.nextLine();

        // List of bad words to be censored
        List<String> badWords = Arrays.asList("damn", "stupid");

        // Replace each bad word with "****"
        String modifiedString = inputString;
        for (String badWord : badWords) {
            modifiedString = modifiedString.replaceAll("\\b" + badWord + "\\b", "****");
        }

        // Print the modified string
        System.out.println(modifiedString);
    }
}