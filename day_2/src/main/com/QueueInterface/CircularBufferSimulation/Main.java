package com.QueueInterface.CircularBufferSimulation;

public class Main {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.printBuffer(); // Output: 1 2 3

        buffer.insert(4);
        buffer.printBuffer(); // Output: 2 3 4

        System.out.println("Retrieved: " + buffer.retrieve()); // Output: Retrieved: 2
        buffer.printBuffer(); // Output: 3 4
    }
}