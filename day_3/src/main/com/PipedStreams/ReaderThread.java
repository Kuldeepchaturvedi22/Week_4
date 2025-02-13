package com.PipedStreams;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReaderThread extends Thread {
    private PipedInputStream pipedInputStream;

    public ReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        try {
            int data;
            // Read data from the PipedInputStream
            while ((data = pipedInputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred in ReaderThread: " + e.getMessage());
        } finally {
            try {
                // Close the PipedInputStream
                pipedInputStream.close();
            } catch (IOException e) {
                System.out.println("Failed to close PipedInputStream: " + e.getMessage());
            }
        }
    }
}