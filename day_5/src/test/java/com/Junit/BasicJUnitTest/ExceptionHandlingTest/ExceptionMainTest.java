package com.Junit.BasicJUnitTest.ExceptionHandlingTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionMainTest {

    @Test
    public void testDivideByZero() {
        Main calculator = new Main();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}