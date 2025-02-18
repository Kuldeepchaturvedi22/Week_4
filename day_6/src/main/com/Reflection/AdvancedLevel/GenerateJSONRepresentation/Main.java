package com.Reflection.AdvancedLevel.GenerateJSONRepresentation;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person.setName("John Doe");
            person.setAge(30);

            String json = JsonConverter.toJson(person);
            System.out.println(json);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}