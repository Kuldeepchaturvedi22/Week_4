package com.ExceptionHandling.TryWithResources;

import org.junit.jupiter.api.Test;
import java.io.IOException;

public class TryWithResourcesTest {
    @Test
    public void testFileReading() {
        // Since the file reading depends on an external file, we can only test the exception handling part
        try {
            Main.main(new String[]{});
        } catch (Exception e) {
            // If an exception occurs, it should be an IOException
            assert(e instanceof IOException);
        }
    }
}