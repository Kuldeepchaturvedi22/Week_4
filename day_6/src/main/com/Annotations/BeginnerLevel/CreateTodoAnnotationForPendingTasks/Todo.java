package com.Annotations.BeginnerLevel.CreateTodoAnnotationForPendingTasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
