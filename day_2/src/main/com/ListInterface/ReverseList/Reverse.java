package com.ListInterface.ReverseList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Reverse {

    // Method to reverse an ArrayList
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arrayList) {
        int size = arrayList.size() / 2;
        for (int i = 0; i < size; i++) {
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(arrayList.size() - i - 1));
            arrayList.set(arrayList.size() - i - 1, temp);
        }
        return arrayList;
    }

    // Method to reverse a LinkedList
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList) {
        int size = linkedList.size() / 2;
        for (int i = 0; i < size; i++) {
            int temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(linkedList.size() - i - 1));
            linkedList.set(linkedList.size() - i - 1, temp);
        }
        return linkedList;
    }
}