package com.QueueInterface.GenerateBinaryNumbersUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {
    // Method to generate the first N binary numbers using a queue
    public static void generateBinaryNumbers(int N) {
        // Initialize a queue and add the first binary number "1"
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        // Loop to generate the next binary numbers
        for (int i = 0; i < N; i++) {
            // Dequeue the front element
            String current = queue.remove();
            // Print the current binary number
            System.out.print(current + " ");
            // Enqueue the next binary numbers by appending "0" and "1"
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}