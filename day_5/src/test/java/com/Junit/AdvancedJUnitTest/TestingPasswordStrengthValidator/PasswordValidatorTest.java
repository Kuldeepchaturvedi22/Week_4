package com.Junit.AdvancedJUnitTest.TestingPasswordStrengthValidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {
        PasswordValidator validator = new PasswordValidator();
        assertTrue(validator.isValid("Password1"));
    }

    @Test
    public void testInvalidPasswordTooShort() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    public void testInvalidPasswordNoUppercase() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("password1"));
    }

    @Test
    public void testInvalidPasswordNoDigit() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid("Password"));
    }

    @Test
    public void testInvalidPasswordNull() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValid(null));
    }
}