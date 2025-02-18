package com.Reflection.AdvancedLevel.DependencyInjectionUsingReflection;

public class Client {
    @Inject
    private Service service;

    public void doSomething() {
        service.serve();
    }
}