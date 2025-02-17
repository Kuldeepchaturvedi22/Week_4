package com.Annotations.IntermediateLevel.CreateMaxLengthAnnotationForFieldValidation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the MaxLength annotation with runtime retention
@Retention(RetentionPolicy.RUNTIME)
public @interface MaxLength {
    int value();
}