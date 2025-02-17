package com.Annotations.Exercise.UseOverrideCorrectly;

class Animal {
    // Method to make a sound
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Override the makeSound method to provide specific implementation for Dog
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog();
        // Call the overridden makeSound method
        dog.makeSound();
    }
}
