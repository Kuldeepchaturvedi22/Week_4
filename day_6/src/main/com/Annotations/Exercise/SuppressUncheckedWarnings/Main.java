package com.Annotations.Exercise.SuppressUncheckedWarnings;

import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Create an ArrayList without generics
        ArrayList rawList = new ArrayList();

        // Add elements to the list
        rawList.add("String element");
        rawList.add(123); // Adding an integer

        // Print the elements of the list
        for (Object element : rawList) {
            System.out.println(element);
        }
    }
}
