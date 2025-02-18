package com.Reflection.AdvancedLevel.GenerateJSONRepresentation;

import java.lang.reflect.Field;

public class JsonConverter {

    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder();
        json.append("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            json.append("\"").append(field.getName()).append("\":");

            Object value = field.get(obj);
            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }

            if (i < fields.length - 1) {
                json.append(",");
            }
        }

        json.append("}");
        return json.toString();
    }
}
