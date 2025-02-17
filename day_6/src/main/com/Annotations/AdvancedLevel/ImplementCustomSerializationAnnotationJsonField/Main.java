package com.Annotations.AdvancedLevel.ImplementCustomSerializationAnnotationJsonField;

public class Main {
    public static void main(String[] args) {
        // Create a User object
        User user = new User("Kuldeep", 30);

        // Convert the User object to a JSON string
        String jsonString = JsonSerializer.toJson(user);

        // Print the JSON string
        System.out.println(jsonString);
    }
}