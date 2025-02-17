package com.Annotations.AdvancedLevel.ImplementCustomSerializationAnnotationJsonField;

public class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    // Constructor to initialize the fields
    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    // Getters for the fields
    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}