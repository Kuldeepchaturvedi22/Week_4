package com.ListInterface.RotateElementsInList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    public void testRotateList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(4, 5, 1, 2, 3);
        List<Integer> actual = Rotate.rotateList(list, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testRotateListWithZeroRotation() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = Rotate.rotateList(list, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testRotateListWithFullRotation() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = Rotate.rotateList(list, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void testRotateListWithNegativeRotation() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(3, 4, 5, 1, 2);
        List<Integer> actual = Rotate.rotateList(list, -2);
        assertEquals(expected, actual);
    }
}