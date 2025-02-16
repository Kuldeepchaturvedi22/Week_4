package com.Junit.BasicJUnitTest.PerformanceTest;

public class Main {
    // Method that sleeps for 3 seconds before returning a result
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task Completed";
    }
}