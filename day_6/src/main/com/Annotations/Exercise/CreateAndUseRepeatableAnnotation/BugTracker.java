package com.Annotations.Exercise.CreateAndUseRepeatableAnnotation;

public class BugTracker {

    @BugReport(description = "Null pointer exception when input is null")
    @BugReport(description = "Array index out of bounds when index is negative")
    public void processBugs() {
        System.out.println("Processing bugs");
    }
}
