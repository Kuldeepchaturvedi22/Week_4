package com.Junit.AdvancedJUnitTest.TestingUserRegistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    @Test
    public void testValidUserRegistration() {
        UserRegistration registration = new UserRegistration();
        assertDoesNotThrow(() -> {
            registration.registerUser("user123", "user@example.com", "Password1");
        });
    }

    @Test
    public void testInvalidUsername() {
        UserRegistration registration = new UserRegistration();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "user@example.com", "Password1");
        });
        assertEquals("Invalid username", exception.getMessage());
    }

    @Test
    public void testInvalidEmail() {
        UserRegistration registration = new UserRegistration();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("user123", "userexample.com", "Password1");
        });
        assertEquals("Invalid email", exception.getMessage());
    }

    @Test
    public void testInvalidPassword() {
        UserRegistration registration = new UserRegistration();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("user123", "user@example.com", "pass");
        });
        assertEquals("Invalid password", exception.getMessage());
    }
}