package com.Annotations.IntermediateLevel.CreateAnnotationForLoggingMethodExecutionTime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the LogExecutionTime annotation with runtime retention
@Retention(RetentionPolicy.RUNTIME)
public @interface LogExecutionTime {
}