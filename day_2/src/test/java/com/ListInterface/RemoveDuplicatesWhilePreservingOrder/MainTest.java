package com.ListInterface.RemoveDuplicatesWhilePreservingOrder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = RemoveDuplicate.remove(list);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesWithNoDuplicates() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = RemoveDuplicate.remove(list);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesWithAllDuplicates() {
        List<Integer> list = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = RemoveDuplicate.remove(list);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesWithEmptyList() {
        List<Integer> list = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = RemoveDuplicate.remove(list);
        assertEquals(expected, actual);
    }
}