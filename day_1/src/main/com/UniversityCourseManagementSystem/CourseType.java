package com.UniversityCourseManagementSystem;

import java.util.List;

// Abstract class representing a generic course type
public abstract class CourseType<T> {

    private String courseName;
    private double coursePrice;
    private int courseDuration;

    // Constructor to initialize course details
    public CourseType(String courseName, double coursePrice, int courseDuration) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseDuration = courseDuration;
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }

    // Getter for course price
    public double getCoursePrice() {
        return coursePrice;
    }

    // Getter for course duration
    public int getCourseDuration() {
        return courseDuration;
    }

    // Static method to display details of a list of courses
    public static void displayCourse(List<? extends CourseType> course) {
        for (CourseType courseDetails : course) {
            System.out.println("Course Name: " + courseDetails.getCourseName());
            System.out.println("Course Price: " + courseDetails.getCoursePrice() + " Rupees");
            System.out.println("Course Duration: " + courseDetails.getCourseDuration() + " Month");
            System.out.println();
        }
    }
}