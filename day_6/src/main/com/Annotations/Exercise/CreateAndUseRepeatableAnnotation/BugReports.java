package com.Annotations.Exercise.CreateAndUseRepeatableAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface BugReports {
    BugReport[] value();
}
