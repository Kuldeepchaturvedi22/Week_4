package com.ListInterface.FindNthElementFromEnd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.LinkedList;

public class MainTest {

    @Test
    public void testFindNthElement() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(4, FindElement.findNthElement(list, 2));
        assertEquals(5, FindElement.findNthElement(list, 1));
        assertEquals(1, FindElement.findNthElement(list, 5));
    }

    @Test
    public void testFindNthElementWithInvalidIndex() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            FindElement.findNthElement(list, 0);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            FindElement.findNthElement(list, 4);
        });
    }

    @Test
    public void testFindNthElementWithEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            FindElement.findNthElement(list, 1);
        });
    }
}