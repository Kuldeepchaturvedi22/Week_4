package com.ReadLargeFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "user_data.txt"; // Path to the large text file

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Check if the line contains the word "error" (case_insensitive)
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}