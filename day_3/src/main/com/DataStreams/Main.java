package com.DataStreams;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filename = "students.dat";

        // Store student details
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filename))) {
            dataOutputStream.writeInt(1); // Roll number
            dataOutputStream.writeUTF("Alice"); // Name
            dataOutputStream.writeDouble(3.8); // GPA

            dataOutputStream.writeInt(2); // Roll number
            dataOutputStream.writeUTF("Bob"); // Name
            dataOutputStream.writeDouble(3.6); // GPA

            System.out.println("Student details have been written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }

        // Retrieve student details
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filename))) {
            while (dataInputStream.available() > 0) {
                int rollNumber = dataInputStream.readInt();
                String name = dataInputStream.readUTF();
                double gpa = dataInputStream.readDouble();
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}