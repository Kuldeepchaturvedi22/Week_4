package com.MapInterface.FindKeyWithHighestValue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class MainTest {

    @Test
    public void testFindKeyWithHighestValue() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 10);
        map.put('B', 20);
        map.put('C', 15);

        Character expected = 'B';
        Character actual = HighestValueKey.findKeyWithHighestValue(map);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindKeyWithHighestValueWithEmptyMap() {
        Map<Character, Integer> map = new HashMap<>();

        Character expected = null;
        Character actual = HighestValueKey.findKeyWithHighestValue(map);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindKeyWithHighestValueWithSingleElement() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 10);

        Character expected = 'A';
        Character actual = HighestValueKey.findKeyWithHighestValue(map);
        assertEquals(expected, actual);
    }
}