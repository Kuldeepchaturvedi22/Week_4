package com.Junit.BasicJUnitTest.ListOperationsTest;

import java.util.List;

public class Main {
    // Method to add an element to a list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Method to remove an element from a list
    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    // Method to get the size of a list
    public int getSize(List<Integer> list) {
        return list.size();
    }
}