package com.ExceptionHandling.MultipleCatchBlocks;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MultipleCatchBlocksTest {

    @Test
    public void testValidIndex() {
        // Simulate user input for valid index
        String input = "3\n1\n2\n3\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Call the main method
        Main.main(new String[]{});

        // Verify the output
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Value at index 1 : 2"));
    }

    @Test
    public void testInvalidIndex() {
        // Simulate user input for invalid index
        String input = "3\n1\n2\n3\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Call the main method
        Main.main(new String[]{});

        // Verify the output
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Invalid index!"));
    }

    @Test
    public void testArrayNotInitialized() {
        // Simulate user input for array not initialized
        String input = "0\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Call the main method
        Main.main(new String[]{});

        // Verify the output
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Invalid index!"));
    }
}