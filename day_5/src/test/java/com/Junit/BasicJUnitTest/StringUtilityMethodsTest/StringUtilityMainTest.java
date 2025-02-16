package com.Junit.BasicJUnitTest.StringUtilityMethodsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityMainTest {

    @Test
    public void testReverse() {
        Main stringUtils = new Main();
        assertEquals("cba", stringUtils.reverse("abc"));
        assertEquals("54321", stringUtils.reverse("12345"));
    }

    @Test
    public void testIsPalindrome() {
        Main stringUtils = new Main();
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    public void testToUpperCase() {
        Main stringUtils = new Main();
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("world"));
    }
}