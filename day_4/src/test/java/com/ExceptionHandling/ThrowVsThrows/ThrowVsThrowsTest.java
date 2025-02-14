package com.ExceptionHandling.ThrowVsThrows;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThrowVsThrowsTest {

    @Test
    public void testCalculateInterestValidInput() {
        // Test with valid input
        double interest = Main.calculateInterest(1000, 5, 2);
        assertEquals(100, interest);
    }

    @Test
    public void testCalculateInterestNegativeAmount() {
        // Test with negative amount
        assertThrows(IllegalArgumentException.class, () -> {
            Main.calculateInterest(-1000, 5, 2);
        });
    }

    @Test
    public void testCalculateInterestNegativeRate() {
        // Test with negative rate
        assertThrows(IllegalArgumentException.class, () -> {
            Main.calculateInterest(1000, -5, 2);
        });
    }

    @Test
    public void testCalculateInterestNegativeAmountAndRate() {
        // Test with negative amount and rate
        assertThrows(IllegalArgumentException.class, () -> {
            Main.calculateInterest(-1000, -5, 2);
        });
    }
}