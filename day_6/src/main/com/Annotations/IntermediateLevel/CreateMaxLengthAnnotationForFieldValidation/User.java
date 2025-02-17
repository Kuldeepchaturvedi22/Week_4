package com.Annotations.IntermediateLevel.CreateMaxLengthAnnotationForFieldValidation;

public class User {

    @MaxLength(10) // Set the maximum length to 10
    private String username;

    // Constructor to initialize the username
    public User(String username) {
        // Validate the length of the username
        if (username.length() > 10) {
            throw new IllegalArgumentException("Username cannot be longer than 10 characters");
        }
        this.username = username;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }
}