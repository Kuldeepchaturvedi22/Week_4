package com.Junit.BasicJUnitTest.FileHandlingMethodsTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class FileHandlingMainTest {

    @TempDir
    Path tempDir;

    @Test
    public void testWriteAndReadFile() throws IOException {
        Main fileProcessor = new Main();
        Path filePath = tempDir.resolve("testFile.txt");
        String content = "Hello, World!";

        fileProcessor.writeToFile(filePath.toString(), content);
        String readContent = fileProcessor.readFromFile(filePath.toString());

        assertEquals(content, readContent);
    }

    @Test
    public void testFileExistsAfterWriting() throws IOException {
        Main fileProcessor = new Main();
        Path filePath = tempDir.resolve("testFile.txt");
        String content = "Hello, World!";

        fileProcessor.writeToFile(filePath.toString(), content);

        assertTrue(Files.exists(filePath));
    }

    @Test
    public void testIOExceptionWhenFileDoesNotExist() {
        Main fileProcessor = new Main();
        String nonExistentFile = tempDir.resolve("nonExistentFile.txt").toString();

        Exception exception = assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile(nonExistentFile);
        });

        assertNotNull(exception.getMessage());
    }
}