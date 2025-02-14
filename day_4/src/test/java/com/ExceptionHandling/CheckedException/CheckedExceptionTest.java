package com.ExceptionHandling.CheckedException;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CheckedExceptionTest {
    @Test
    public void testIOException() {
        // Simulate the scenario where the file does not exist to trigger an IOException
        assertThrows(IOException.class, () -> {
            Main.main(new String[]{});
        });
    }
}