package com.Annotations.AdvancedLevel.ImplementCustomSerializationAnnotationJsonField;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the JsonField annotation with runtime retention
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonField {
    String name();
}