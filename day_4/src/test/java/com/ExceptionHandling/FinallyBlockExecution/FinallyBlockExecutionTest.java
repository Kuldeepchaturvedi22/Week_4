package com.ExceptionHandling.FinallyBlockExecution;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class FinallyBlockExecutionTest {

    @Test
    public void testDivisionByZero() {
        // Simulate user input for division by zero
        String input = "10\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Call the main method
        Main.main(new String[]{});

        // Verify the output
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Error: Division by zero is not allowed."));
        assertTrue(consoleOutput.contains("Operation completed"));
    }

    @Test
    public void testValidDivision() {
        // Simulate user input for valid division
        String input = "10\n2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Call the main method
        Main.main(new String[]{});

        // Verify the output
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Result: 5"));
        assertTrue(consoleOutput.contains("Operation completed"));
    }
}