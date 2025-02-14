package com.ExceptionHandling.NestedTryCatchBlock;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class NestedTryCatchBlockTest {

    @Test
    public void testValidIndexAndDivisor() {
        // Simulate user input for valid index and divisor
        String input = "3\n1\n2\n3\n1\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Call the main method
        Main.main(new String[]{});

        // Verify the output
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Result when dividing the value at the given index by the divisor: 2"));
    }

    @Test
    public void testInvalidIndex() {
        // Simulate user input for invalid index
        String input = "3\n1\n2\n3\n5\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Call the main method
        Main.main(new String[]{});

        // Verify the output
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Invalid array index!"));
    }

    @Test
    public void testDivisionByZero() {
        // Simulate user input for division by zero
        String input = "3\n1\n2\n3\n1\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Call the main method
        Main.main(new String[]{});

        // Verify the output
        String consoleOutput = out.toString();
        assertTrue(consoleOutput.contains("Cannot divide by zero!"));
    }
}