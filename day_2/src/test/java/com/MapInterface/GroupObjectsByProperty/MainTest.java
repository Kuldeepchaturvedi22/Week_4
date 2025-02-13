package com.MapInterface.GroupObjectsByProperty;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainTest {

    @Test
    public void testGroupByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> expected = Map.of(
                "HR", Arrays.asList(new Employee("Alice", "HR"), new Employee("Carol", "HR")),
                "IT", Arrays.asList(new Employee("Bob", "IT"))
        );

        Map<String, List<Employee>> actual = GroupObjects.groupByDepartment(employees);
        assertEquals(expected, actual);
    }

    @Test
    public void testGroupByDepartmentWithEmptyList() {
        List<Employee> employees = Arrays.asList();

        Map<String, List<Employee>> expected = Map.of();
        Map<String, List<Employee>> actual = GroupObjects.groupByDepartment(employees);
        assertEquals(expected, actual);
    }

    @Test
    public void testGroupByDepartmentWithSingleElement() {
        List<Employee> employees = Arrays.asList(new Employee("Alice", "HR"));

        Map<String, List<Employee>> expected = Map.of(
                "HR", Arrays.asList(new Employee("Alice", "HR"))
        );

        Map<String, List<Employee>> actual = GroupObjects.groupByDepartment(employees);
        assertEquals(expected, actual);
    }
}