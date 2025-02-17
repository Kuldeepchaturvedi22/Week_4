package com.Annotations.Exercise.CreateAndUseRepeatableAnnotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the BugTracker class
            Class<BugTracker> bugTrackerClass = BugTracker.class;

            // Get the processBugs method
            Method method = bugTrackerClass.getMethod("processBugs");

            // Check if the method has the BugReports annotation
            if (method.isAnnotationPresent(BugReports.class)) {
                // Get the BugReports annotation
                BugReports bugReports = method.getAnnotation(BugReports.class);

                // Print each BugReport description
                for (BugReport bugReport : bugReports.value()) {
                    System.out.println("Bug Description: " + bugReport.description());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
