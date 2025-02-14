package com.ExceptionHandling.BankTransactionSystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTransactionSystemTest {

    @Test
    public void testWithdrawInsufficientBalance() {
        // Test that withdraw throws InsufficientBalanceException when amount exceeds balance
        assertThrows(InsufficientBalanceException.class, () -> {
            Main.withdraw(100, 50);
        });
    }

    @Test
    public void testWithdrawNegativeAmount() {
        // Test that withdraw throws IllegalArgumentException when amount is negative
        assertThrows(IllegalArgumentException.class, () -> {
            Main.withdraw(-10, 50);
        });
    }

    @Test
    public void testWithdrawValidAmount() {
        // Test that withdraw returns the correct new balance when amount is valid
        try {
            double newBalance = Main.withdraw(30, 50);
            assertEquals(20, newBalance);
        } catch (Exception e) {
            fail("Exception should not be thrown for valid amount");
        }
    }
}