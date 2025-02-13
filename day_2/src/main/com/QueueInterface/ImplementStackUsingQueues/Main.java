package com.QueueInterface.ImplementStackUsingQueues;

public class Main {
    public static void main(String[] args) {
        // Create a new stack using two queues
        StackUsingQueue stack = new StackUsingQueue();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Get and print the top element of the stack
        System.out.println("Top element: " + stack.top()); // Output: 3

        // Pop the top element from the stack and print it
        System.out.println("Popped element: " + stack.pop()); // Output: 3

        // Get and print the new top element of the stack
        System.out.println("Top element: " + stack.top()); // Output: 2
    }
}