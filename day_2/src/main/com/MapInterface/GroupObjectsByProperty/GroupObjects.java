package com.MapInterface.GroupObjectsByProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Employee class representing an employee with a name and department
class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

// GroupObjects class containing the method to group employees by department
public class GroupObjects {
    // Method to group employees by their department
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedByDepartment = new HashMap<>();

        // Iterate through each employee in the list
        for (Employee employee : employees) {
            // Get the department of the current employee
            String department = employee.getDepartment();

            // If the department is not already in the map, add it with a new list
            groupedByDepartment.putIfAbsent(department, new ArrayList<>());

            // Add the employee to the list corresponding to their department
            groupedByDepartment.get(department).add(employee);
        }
        return groupedByDepartment;
    }
}