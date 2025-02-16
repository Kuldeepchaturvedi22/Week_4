package com.Junit.BasicJUnitTest.ParameterizedTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedMainTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    public void testIsEven(int number) {
        Main main = new Main();
        if (number % 2 == 0) {
            assertTrue(main.isEven(number));
        } else {
            assertFalse(main.isEven(number));
        }
    }
}