package com.Reflection.AdvancedLevel.DependencyInjectionUsingReflection;

public class Main {
    public static void main(String[] args) {
        try {
            DIContainer container = new DIContainer();
            Client client = container.getInstance(Client.class);
            client.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}