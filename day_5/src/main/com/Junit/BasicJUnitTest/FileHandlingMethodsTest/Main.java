package com.Junit.BasicJUnitTest.FileHandlingMethodsTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    // Method to write content to a file
    public void writeToFile(String filename, String content) throws IOException {
        Files.write(Paths.get(filename), content.getBytes());
    }

    // Method to read content from a file
    public String readFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
}