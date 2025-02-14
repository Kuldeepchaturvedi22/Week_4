package com.ExceptionHandling.CustomException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class CustomExceptionTest {
    @Test
    public void testValidateAgeThrowsException() {
        // Test that validateAge throws InvalidAgeException for age less than 18
        assertThrows(InvalidAgeException.class, () -> Main.validateAge(17));
    }

    @Test
    public void testValidateAgeDoesNotThrowException() {
        // Test that validateAge does not throw an exception for age 18 or above
        try {
            Main.validateAge(18);
        } catch (InvalidAgeException e) {
            // If an exception is thrown, the test should fail
            fail("Exception should not be thrown for age 18 or above");
        }
    }
}