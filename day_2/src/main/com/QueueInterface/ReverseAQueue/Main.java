package com.QueueInterface.ReverseAQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Create a queue and add elements to it
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Print the original queue
        System.out.println("Original queue: " + queue);

        // Reverse the queue
        queue = Reverse.queueReverse(queue);

        // Print the reversed queue
        System.out.println("Reversed queue: " + queue);
    }
}