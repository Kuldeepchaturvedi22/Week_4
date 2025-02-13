package com.FilterStreams;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "user_data.txt";
        String destinationFile = "destination.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Convert the line to lowercase and write it to the destination file
                bufferedWriter.write(line.toLowerCase());
                bufferedWriter.newLine();
            }
            System.out.println("File has been converted to lowercase and written to " + destinationFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}