package com.MapInterface.InvertMap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {

    @Test
    public void testInvertMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 1);

        Map<Integer, List<Character>> expected = Map.of(
                1, Arrays.asList('A', 'C'),
                2, Arrays.asList('B')
        );

        Map<Integer, List<Character>> actual = InvertMap.invert(map);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvertMapWithEmptyMap() {
        Map<Character, Integer> map = new HashMap<>();

        Map<Integer, List<Character>> expected = Map.of();
        Map<Integer, List<Character>> actual = InvertMap.invert(map);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvertMapWithSingleElement() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 1);

        Map<Integer, List<Character>> expected = Map.of(
                1, Arrays.asList('A')
        );

        Map<Integer, List<Character>> actual = InvertMap.invert(map);
        assertEquals(expected, actual);
    }
}