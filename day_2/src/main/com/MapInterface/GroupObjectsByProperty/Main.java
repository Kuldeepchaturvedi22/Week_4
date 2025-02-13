package com.MapInterface.GroupObjectsByProperty;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // Group the employees by their department using the GroupObjects class
        Map<String, List<Employee>> groupedByDepartment = GroupObjects.groupByDepartment(employees);

        // Print the grouped employees by department
        for (Map.Entry<String, List<Employee>> entry : groupedByDepartment.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}