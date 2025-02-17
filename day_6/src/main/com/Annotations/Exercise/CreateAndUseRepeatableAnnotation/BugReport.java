package com.Annotations.Exercise.CreateAndUseRepeatableAnnotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface BugReport {
    String description();
}
