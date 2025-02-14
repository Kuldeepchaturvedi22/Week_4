package com.ExceptionHandling.CheckedException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Name of the file to be read
        String fileName = "newFile.txt";

        // Try-with-resources statement to ensure the BufferedReader is closed automatically
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line from the file until the end of the file is reached
            while((line = bufferedReader.readLine()) != null){
                // Print the line followed by a space
                System.out.print(line + " ");
            }
        } catch (IOException e) {
            // Handle any IOExceptions that occur during file reading
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}