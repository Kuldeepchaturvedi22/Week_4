package com.ExceptionHandling.ExceptionPropagationInMethods;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionPropagationInMethodsTest {
    @Test
    public void testExceptionPropagation() {
        assertThrows(ArithmeticException.class, Main::method2);
    }
}