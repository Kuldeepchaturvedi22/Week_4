package com.ExceptionHandling.UncheckedException;

import org.junit.jupiter.api.Test;
import java.util.InputMismatchException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UncheckedExceptionTest {
    @Test
    public void testDivisionByZero() {
        // Simulate user input for division by zero
        System.setIn(new java.io.ByteArrayInputStream("10\n0\n".getBytes()));
        assertThrows(ArithmeticException.class, () -> Main.main(new String[]{}));
    }

    @Test
    public void testNonNumericInput() {
        // Simulate user input for non-numeric value
        System.setIn(new java.io.ByteArrayInputStream("10\na\n".getBytes()));
        assertThrows(InputMismatchException.class, () -> Main.main(new String[]{}));
    }
}