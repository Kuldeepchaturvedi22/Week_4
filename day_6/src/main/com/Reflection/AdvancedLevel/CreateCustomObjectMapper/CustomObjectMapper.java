package com.Reflection.AdvancedLevel.CreateCustomObjectMapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        // Create a new instance of the class
        T instance = clazz.getDeclaredConstructor().newInstance();

        // Iterate over the map entries
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String fieldName = entry.getKey();
            Object fieldValue = entry.getValue();

            // Get the field by name
            Field field = clazz.getDeclaredField(fieldName);

            // Make the field accessible
            field.setAccessible(true);

            // Set the field value
            field.set(instance, fieldValue);
        }

        return instance;
    }
}