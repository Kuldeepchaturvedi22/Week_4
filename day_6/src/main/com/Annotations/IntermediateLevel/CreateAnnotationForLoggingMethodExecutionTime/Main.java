package com.Annotations.IntermediateLevel.CreateAnnotationForLoggingMethodExecutionTime;

// Main class to test the LogExecutionTime annotation
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create an instance of SampleService
        SampleService service = new SampleService();

        // Call the serve method and measure execution time
        service.serve();

        // Call the process method and measure execution time
        service.process();
    }
}