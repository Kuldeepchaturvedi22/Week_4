package com.Annotations.AdvancedLevel.ImplementCustomCachingSystemWithCacheResult;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ExpensiveService
        ExpensiveService service = new ExpensiveService();

        // Test the caching mechanism
        System.out.println("First call: " + CacheHandler.invokeMethod(service, "expensiveComputation", 5));
        System.out.println("Second call: " + CacheHandler.invokeMethod(service, "expensiveComputation", 5));
    }
}