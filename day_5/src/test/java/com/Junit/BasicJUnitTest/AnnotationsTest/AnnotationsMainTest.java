package com.Junit.BasicJUnitTest.AnnotationsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnnotationsMainTest {
    private Main dbConnection;

    @BeforeEach
    public void setUp() {
        dbConnection = new Main();
        dbConnection.connect();
    }

    @AfterEach
    public void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    public void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected());
    }

    @Test
    public void testConnectionClosed() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
    }
}