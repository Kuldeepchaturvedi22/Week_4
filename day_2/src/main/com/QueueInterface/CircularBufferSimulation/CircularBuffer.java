package com.QueueInterface.CircularBufferSimulation;

public class CircularBuffer {
    private int[] buffer;
    private int size;
    private int start;
    private int end;
    private int count;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        start = 0;
        end = 0;
        count = 0;
    }

    // Insert an element into the buffer
    public void insert(int element) {
        buffer[end] = element;
        end = (end + 1) % size;
        if (count == size) {
            start = (start + 1) % size; // Overwrite the oldest element
        } else {
            count++;
        }
    }

    // Retrieve an element from the buffer
    public int retrieve() {
        if (count == 0) {
            throw new RuntimeException("Buffer is empty");
        }
        int element = buffer[start];
        start = (start + 1) % size;
        count--;
        return element;
    }

    // Check if the buffer is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Check if the buffer is full
    public boolean isFull() {
        return count == size;
    }

    // Print the buffer elements
    public void printBuffer() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(start + i) % size] + " ");
        }
        System.out.println();
    }
}