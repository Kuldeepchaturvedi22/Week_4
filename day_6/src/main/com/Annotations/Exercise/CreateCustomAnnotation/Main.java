package com.Annotations.Exercise.CreateCustomAnnotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the TaskManager class
            Class<TaskManager> taskManagerClass = TaskManager.class;

            // Get the completeTask method
            Method method = taskManagerClass.getMethod("completeTask");

            // Check if the method has the TaskInfo annotation
            if (method.isAnnotationPresent(TaskInfo.class)) {
                // Get the TaskInfo annotation
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                // Print the annotation details
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
