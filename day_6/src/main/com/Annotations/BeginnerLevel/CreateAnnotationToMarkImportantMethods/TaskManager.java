package com.Annotations.BeginnerLevel.CreateAnnotationToMarkImportantMethods;

public class TaskManager {
    @ImportantMethod(level = "HIGH")
    public void criticalTask() {
        System.out.println("Executing critical task");
    }

    @ImportantMethod(level = "MEDIUM")
    public void importantTask() {
        System.out.println("Executing important task");
    }

    public void regularTask() {
        System.out.println("Executing regular task");
    }
}