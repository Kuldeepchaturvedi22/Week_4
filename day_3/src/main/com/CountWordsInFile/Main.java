package com.CountWordsInFile;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "user_data.txt"; // Path to the text file

        // HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Sort the words based on frequency
        List<Map.Entry<String, Integer>> sortedWordList = new ArrayList<>(wordCountMap.entrySet());
        sortedWordList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Display the top 5 most frequently occurring words
        System.out.println("Top 5 most frequently occurring words:");
        for (int i = 0; i < Math.min(5, sortedWordList.size()); i++) {
            Map.Entry<String, Integer> entry = sortedWordList.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}