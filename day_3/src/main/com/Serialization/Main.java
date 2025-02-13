package com.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Engineering", 75000));
        employees.add(new Employee(2, "Bob", "Marketing", 65000));
        employees.add(new Employee(3, "Alice", "Sales", 60000));

        String filename = "employees.ser";

        // Serialize the list of employees
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            objectOutputStream.writeObject(employees);
            System.out.println("Employees have been serialized to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred during serialization: " + e.getMessage());
        }

        // Deserialize the list of employees
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
            List<Employee> deserializedEmployees = (List<Employee>) objectInputStream.readObject();
            System.out.println("Employees have been deserialized from " + filename);
            deserializedEmployees.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization: " + e.getMessage());
        }
    }
}