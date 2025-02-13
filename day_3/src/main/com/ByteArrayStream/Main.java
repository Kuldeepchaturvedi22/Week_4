package com.ByteArrayStream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sourceImage = "sourceImage.jpg";
        String destinationImage = "destinationImage.jpg";

        try {
            // Read the image file into a byte array
            byte[] imageBytes = Files.readAllBytes(new File(sourceImage).toPath());

            // Write the byte array to a new image file
            try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes);
                 ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {

                int byteContent;
                while ((byteContent = byteArrayInputStream.read()) != -1) {
                    byteArrayOutputStream.write(byteContent);
                }

                // Write the output stream to the destination file
                try (FileOutputStream fos = new FileOutputStream(destinationImage)) {
                    byteArrayOutputStream.writeTo(fos);
                }
            }

            // Verify that the new file is identical to the original image
            byte[] newImageBytes = Files.readAllBytes(new File(destinationImage).toPath());
            if (Arrays.equals(imageBytes, newImageBytes)) {
                System.out.println("The new image file is identical to the original image.");
            } else {
                System.out.println("The new image file is not identical to the original image.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}