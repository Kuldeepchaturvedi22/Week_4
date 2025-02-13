package com.ListInterface.RotateElementsInList;

import java.util.List;

public class Rotate {

    // Method to rotate the elements in the list by the given rotation number
    public static List<Integer> rotateList(List<Integer> list, int rotationNumber) {
        for (int i = 0; i < rotationNumber; i++) {
            // Store the last element in a temporary variable
            int temp = list.get(list.size() - 1);
            // Shift all elements to the right by one position
            for (int j = list.size() - 1; j > 0; j--) {
                list.set(j, list.get(j - 1));
            }
            // Set the first element to the previously stored last element
            list.set(0, temp);
        }
        return list;
    }
}