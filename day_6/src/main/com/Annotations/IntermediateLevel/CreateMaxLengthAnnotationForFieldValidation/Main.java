package com.Annotations.IntermediateLevel.CreateMaxLengthAnnotationForFieldValidation;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a User object with a valid username
            User user1 = new User("Kuldeep");
            System.out.println("User1 created: " + user1.getUsername());

            // Create a User object with an invalid username
            User user2 = new User("Kuldeep12345");
            System.out.println("User2 created: " + user2.getUsername());
        } catch (IllegalArgumentException e) {
            // Catch and print the exception if the username is too long
            System.out.println(e.getMessage());
        }
    }
}