package com.Reflection.AdvancedLevel.CustomLoggingProxyUsingReflection;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the target class
        Greeting greeting = new GreetingImpl();

        // Create a proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                greeting.getClass().getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingInvocationHandler(greeting)
        );

        // Call the method on the proxy instance
        proxyInstance.sayHello();
    }
}
