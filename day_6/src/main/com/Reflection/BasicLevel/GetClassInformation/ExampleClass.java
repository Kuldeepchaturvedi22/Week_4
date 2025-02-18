package com.Reflection.BasicLevel.GetClassInformation;

public class ExampleClass {
    public int id;
    public String name;

    public ExampleClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show () {
        System.out.println(id);
        System.out.println(name);
    }
}