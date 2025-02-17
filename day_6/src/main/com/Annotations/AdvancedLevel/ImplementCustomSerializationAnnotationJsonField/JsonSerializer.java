package com.Annotations.AdvancedLevel.ImplementCustomSerializationAnnotationJsonField;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {

    // Method to convert an object to a JSON string
    public static String toJson(Object obj) {
        Map<String, String> jsonElements = new HashMap<>();
        Class<?> objClass = obj.getClass();

        // Iterate over the fields of the class
        for (Field field : objClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField jsonField = field.getAnnotation(JsonField.class);
                try {
                    // Get the field value and put it in the map with the custom JSON key
                    jsonElements.put(jsonField.name(), field.get(obj).toString());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Convert the map to a JSON string
        StringBuilder jsonString = new StringBuilder("{");
        for (Map.Entry<String, String> entry : jsonElements.entrySet()) {
            jsonString.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
        }
        if (jsonString.length() > 1) {
            jsonString.setLength(jsonString.length() - 2); // Remove the trailing comma and space
        }
        jsonString.append("}");
        return jsonString.toString();
    }
}
