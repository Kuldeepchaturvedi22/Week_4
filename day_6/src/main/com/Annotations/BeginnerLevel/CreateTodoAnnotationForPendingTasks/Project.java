package com.Annotations.BeginnerLevel.CreateTodoAnnotationForPendingTasks;

public class Project {
    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void login() {
        // Implementation pending
    }

    @Todo(task = "Add user profile page", assignedTo = "Bob")
    public void userProfile() {
        // Implementation pending
    }

    public void completedFeature() {
        System.out.println("Feature completed");
    }
}
