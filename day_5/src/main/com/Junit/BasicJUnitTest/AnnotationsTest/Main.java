package com.Junit.BasicJUnitTest.AnnotationsTest;

public class Main {
    private boolean connected;

    // Method to establish a database connection
    public void connect() {
        connected = true;
        System.out.println("Database connected.");
    }

    // Method to close the database connection
    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected.");
    }

    // Method to check if the database is connected
    public boolean isConnected() {
        return connected;
    }
}