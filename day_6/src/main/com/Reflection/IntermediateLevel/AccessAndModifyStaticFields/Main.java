package com.Reflection.IntermediateLevel.AccessAndModifyStaticFields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create an instance of Configuration
        Configuration configuration = new Configuration();

        // Get the class of the instance
        Class<?> cls = configuration.getClass();

        // Get the declared field API_KEY
        Field field = cls.getDeclaredField("API_KEY");

        // Make the field accessible
        field.setAccessible(true);

        // Print the old value of API_KEY
        System.out.println("Old API_KEY : " + field.get(configuration));

        // Set a new value to the API_KEY field
        field.set(configuration, 032);

        // Print the new value of API_KEY
        System.out.println("New API_KEY : " + field.get(configuration));
    }
}