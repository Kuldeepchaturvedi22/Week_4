package com.UniversityCourseManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create instances of different types of courses
        ExamCourse examCourse = new ExamCourse("Exam Course",1000,3);
        AssignmentCourse assignmentCourse = new AssignmentCourse("Assignment Course",500,1);
        ResearchCourse researchCourse = new ResearchCourse("Research Course",2000,6);

        // Create a course catalog
        Course<CourseType> courseCatalog = new Course<>();

        // Add courses to the catalog
        courseCatalog.addCourse(examCourse);
        courseCatalog.addCourse(assignmentCourse);
        courseCatalog.addCourse(researchCourse);

        // Display details of all courses in the catalog
        CourseType.displayCourse(courseCatalog.getCoursesDetails());
    }
}