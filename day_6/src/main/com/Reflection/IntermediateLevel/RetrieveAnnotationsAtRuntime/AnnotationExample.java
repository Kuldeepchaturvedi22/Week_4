package com.Reflection.IntermediateLevel.RetrieveAnnotationsAtRuntime;

public class AnnotationExample {
    // Annotate the display method with Author annotation
    @Author(name = "Author name")
    public void display() {
        System.out.println("Executing Author()");
    }
}