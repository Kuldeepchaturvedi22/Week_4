package com.Reflection.AdvancedLevel.MethodExecutionTiming;

public class Service {
    @Timed
    public void serve() {
        System.out.println("Service is serving...");
    }
}