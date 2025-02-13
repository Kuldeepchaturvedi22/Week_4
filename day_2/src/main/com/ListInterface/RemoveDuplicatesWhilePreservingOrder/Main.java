package com.ListInterface.RemoveDuplicatesWhilePreservingOrder;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        // Prompt user to enter the length of the list
        System.out.println("Enter length of list : ");
        int length = scanner.nextInt();

        // Prompt user to enter all numbers
        System.out.println("Enter all numbers : ");
        for(int i = 0; i < length; i++) {
            list.add(scanner.nextInt());
        }

        // Remove duplicates while preserving order
        list = RemoveDuplicate.remove(list);

        // Print the list after removing duplicates
        System.out.println(list);
    }
}