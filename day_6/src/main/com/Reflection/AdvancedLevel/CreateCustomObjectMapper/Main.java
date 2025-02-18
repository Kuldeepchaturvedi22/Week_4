package com.Reflection.AdvancedLevel.CreateCustomObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a map with properties
            Map<String, Object> properties = new HashMap<>();
            properties.put("name", "John Doe");
            properties.put("age", 30);

            // Use CustomObjectMapper to map properties to a Person object
            Person person = CustomObjectMapper.toObject(Person.class, properties);

            // Print the person object
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}