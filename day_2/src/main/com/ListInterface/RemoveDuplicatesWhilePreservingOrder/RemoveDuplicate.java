package com.ListInterface.RemoveDuplicatesWhilePreservingOrder;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

    // Method to remove duplicates while preserving order
    public static List<Integer> remove(List<Integer> list) {
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            // If the element is not in tempList, add it
            if (!tempList.contains(list.get(i))) {
                tempList.add(list.get(i));
            }
        }
        return tempList;
    }
}