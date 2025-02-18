package com.Reflection.IntermediateLevel.RetrieveAnnotationsAtRuntime;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create an instance of AnnotationExample
        AnnotationExample annotationExample = new AnnotationExample();

        // Get the class of the instance
        Class<?> cls = annotationExample.getClass();

        // Get the display method
        Method method = cls.getMethod("display");

        // Check if the method has the Author annotation
        if (method.isAnnotationPresent(Author.class)) {
            // Get the Author annotation
            Author author = method.getAnnotation(Author.class);

            // Print the annotation value
            System.out.println("Annotation value: " + author.name());
        }
    }
}