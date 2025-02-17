package com.Annotations.AdvancedLevel.ImplementRoleBasedAccessControlWithRoleAllowed;

// Simulate a User class with a role
public class User {
    private String role;

    // Constructor to initialize the user role
    public User(String role) {
        this.role = role;
    }

    // Getter for the user role
    public String getRole() {
        return role;
    }
}