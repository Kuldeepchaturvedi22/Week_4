package com.QueueInterface.ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push element x onto stack
    public void push(int x) {
        queue1.add(x);
    }

    // Removes the element on top of the stack and returns that element
    public int pop() {
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int topElement = queue1.remove();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return topElement;
    }

    // Get the top element
    public int top() {
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int topElement = queue1.peek();
        queue2.add(queue1.remove());
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return topElement;
    }

    // Returns whether the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}