package com.BufferedStreams;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "largefile.txt";
        String destinationFileBuffered = "destination_buffered.txt";
        String destinationFileUnbuffered = "destination_unbuffered.txt";

        // Copy using Buffered Streams
        long startTimeBuffered = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFileBuffered))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("An error occurred with buffered streams: " + e.getMessage());
        }
        long endTimeBuffered = System.nanoTime();
        long durationBuffered = endTimeBuffered - startTimeBuffered;

        // Copy using Unbuffered Streams
        long startTimeUnbuffered = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFileUnbuffered)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("An error occurred with unbuffered streams: " + e.getMessage());
        }
        long endTimeUnbuffered = System.nanoTime();
        long durationUnbuffered = endTimeUnbuffered - startTimeUnbuffered;

        // Print the execution times
        System.out.println("Buffered Streams duration: " + durationBuffered + " nanoseconds");
        System.out.println("Unbuffered Streams duration: " + durationUnbuffered + " nanoseconds");
    }
}