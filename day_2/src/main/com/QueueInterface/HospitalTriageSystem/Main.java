package com.QueueInterface.HospitalTriageSystem;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<HospitalTriage> triageQueue = new PriorityQueue<>();

        // Add patients to the queue
        triageQueue.add(new HospitalTriage("John", 3));
        triageQueue.add(new HospitalTriage("Alice", 5));
        triageQueue.add(new HospitalTriage("Bob", 2));

        // Process patients in order of severity
        while (!triageQueue.isEmpty()) {
            HospitalTriage patient = triageQueue.poll();
            System.out.println("Treating patient: " + patient);
        }
    }
}
