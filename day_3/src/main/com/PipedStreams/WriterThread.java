package com.PipedStreams;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread {
    private PipedOutputStream pipedOutputStream;

    public WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                // Write a message to the PipedOutputStream
                pipedOutputStream.write(("Message " + i + "\n").getBytes());
                Thread.sleep(500); // Simulate time-consuming task
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("An error occurred in WriterThread: " + e.getMessage());
        } finally {
            try {
                // Close the PipedOutputStream
                pipedOutputStream.close();
            } catch (IOException e) {
                System.out.println("Failed to close PipedOutputStream: " + e.getMessage());
            }
        }
    }
}