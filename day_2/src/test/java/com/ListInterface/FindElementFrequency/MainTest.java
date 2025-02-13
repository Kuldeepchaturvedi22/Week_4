package com.ListInterface.FindElementFrequency;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainTest {

    @Test
    public void testFrequency() {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> expected = Map.of("apple", 3, "banana", 2, "orange", 1);
        Map<String, Integer> actual = FindFrequency.frequency(list);
        assertEquals(expected, actual);
    }

    @Test
    public void testFrequencyWithEmptyList() {
        List<String> list = Arrays.asList();
        Map<String, Integer> expected = Map.of();
        Map<String, Integer> actual = FindFrequency.frequency(list);
        assertEquals(expected, actual);
    }

    @Test
    public void testFrequencyWithSingleElement() {
        List<String> list = Arrays.asList("apple");
        Map<String, Integer> expected = Map.of("apple", 1);
        Map<String, Integer> actual = FindFrequency.frequency(list);
        assertEquals(expected, actual);
    }
}