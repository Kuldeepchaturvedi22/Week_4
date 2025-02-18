package com.Reflection.AdvancedLevel.MethodExecutionTiming;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        Service proxyInstance = (Service) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                new Class[]{Service.class},
                new TimingInvocationHandler(service)
        );

        proxyInstance.serve();
    }
}