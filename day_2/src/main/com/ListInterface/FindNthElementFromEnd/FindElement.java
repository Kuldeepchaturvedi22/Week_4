package com.ListInterface.FindNthElementFromEnd;

import java.util.LinkedList;

public class FindElement {

    // Method to find the nth element from the end of the linked list
    public static int findNthElement(LinkedList<Integer> linkedList, int index) {
        // Convert index to a positive value from the end
        index = 0 - index;
        // Iterate through the linked list to adjust the index
        for (int i : linkedList) {
            index++;
        }
        // Return the element at the adjusted index
        return linkedList.get(index);
    }
}