package com.MapInterface.MergeTwoMaps;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class MainTest {

    @Test
    public void testMergeMaps() {
        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('A', 1);
        map1.put('B', 2);

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('B', 3);
        map2.put('C', 4);

        Map<Character, Integer> expected = new HashMap<>();
        expected.put('A', 1);
        expected.put('B', 5);
        expected.put('C', 4);

        Map<Character, Integer> actual = Merge.merge(map1, map2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMergeMapsWithEmptyMap1() {
        Map<Character, Integer> map1 = new HashMap<>();

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('B', 3);
        map2.put('C', 4);

        Map<Character, Integer> expected = new HashMap<>();
        expected.put('B', 3);
        expected.put('C', 4);

        Map<Character, Integer> actual = Merge.merge(map1, map2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMergeMapsWithEmptyMap2() {
        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('A', 1);
        map1.put('B', 2);

        Map<Character, Integer> map2 = new HashMap<>();

        Map<Character, Integer> expected = new HashMap<>();
        expected.put('A', 1);
        expected.put('B', 2);

        Map<Character, Integer> actual = Merge.merge(map1, map2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMergeMapsWithBothEmpty() {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        Map<Character, Integer> expected = new HashMap<>();

        Map<Character, Integer> actual = Merge.merge(map1, map2);
        assertEquals(expected, actual);
    }
}