package com.Annotations.IntermediateLevel.CreateAnnotationForLoggingMethodExecutionTime;

// Define a service class with methods to be measured
public class SampleService {

    // Apply the LogExecutionTime annotation to measure execution time
    @LogExecutionTime
    public void serve() throws InterruptedException {
        long start = System.nanoTime(); // Record start time
        Thread.sleep(200); // Simulate a method execution time
        long executionTime = System.nanoTime() - start; // Calculate execution time
        System.out.println("serve executed in " + executionTime + "ns"); // Print execution time
    }

    // Apply the LogExecutionTime annotation to another method
    @LogExecutionTime
    public void process() throws InterruptedException {
        long start = System.nanoTime(); // Record start time
        Thread.sleep(100); // Simulate a method execution time
        long executionTime = System.nanoTime() - start; // Calculate execution time
        System.out.println("process executed in " + executionTime + "ns"); // Print execution time
    }
}