package com.QueueInterface.ReverseAQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse {
    // Method to reverse a queue using recursion
    public static Queue<Integer> queueReverse(Queue<Integer> queue) {
        // Base case: if the queue is empty, return it
        if (queue.isEmpty()) {
            return queue;
        }
        // Remove the front element
        int front = queue.remove();
        // Recursively reverse the remaining queue
        queue = queueReverse(queue);
        // Add the removed element to the back of the reversed queue
        queue.add(front);
        return queue;
    }
}