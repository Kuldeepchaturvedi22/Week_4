package com.Annotations.AdvancedLevel.ImplementCustomCachingSystemWithCacheResult;

// Class with a computationally expensive method
public class ExpensiveService {

    // Apply the CacheResult annotation to cache the result of this method
    @CacheResult
    public int expensiveComputation(int input) {
        try {
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return input * input;
    }
}