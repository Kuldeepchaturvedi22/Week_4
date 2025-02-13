package com.ListInterface.ReverseList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTest {

    @Test
    public void testReverseArrayList() {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(List.of(5, 4, 3, 2, 1));
        Reverse.reverseArrayList(list);
        assertEquals(expected, list);
    }

    @Test
    public void testReverseLinkedList() {
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> expected = new LinkedList<>(List.of(5, 4, 3, 2, 1));
        Reverse.reverseLinkedList(list);
        assertEquals(expected, list);
    }
}