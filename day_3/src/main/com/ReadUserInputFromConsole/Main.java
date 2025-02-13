package com.ReadUserInputFromConsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Create a BufferedReader to read input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "user_data.txt"; // Name of the file to save user data

        try {
            // Prompt the user to enter their name
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            // Prompt the user to enter their age
            System.out.print("Enter your age: ");
            String age = reader.readLine();

            // Prompt the user to enter their favorite programming language
            System.out.print("Enter your favorite programming language: ");
            String favoriteLanguage = reader.readLine();

            // Use FileWriter to write the user data into the file
            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write("Name: " + name + "\n");
                writer.write("Age: " + age + "\n");
                writer.write("Favorite Programming Language: " + favoriteLanguage + "\n");
                System.out.println("User data saved successfully.");
            }
        } catch (IOException e) {
            // Handle any IO exceptions that occur
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}