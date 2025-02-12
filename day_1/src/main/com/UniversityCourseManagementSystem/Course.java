package com.UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Generic class representing a course catalog
public class Course<T extends CourseType> {

    private List<T> courses;

    // Constructor to initialize the course catalog with an empty list
    public Course() {
        courses = new ArrayList<>();
    }

    // Method to add a course to the catalog
    public void addCourse(T course) {
        courses.add(course);
    }

    // Method to get details of all courses in the catalog
    public List<T> getCoursesDetails() {
        return courses;
    }
}