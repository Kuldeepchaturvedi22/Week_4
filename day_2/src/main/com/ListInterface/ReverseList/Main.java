package com.ListInterface.ReverseList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the length of the list
        System.out.println("Enter the length of list : ");
        int listLength = scanner.nextInt();

        // Prompt user to enter the elements of the list
        System.out.println("Enter the elements of list : ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < listLength; i++) {
            int element = scanner.nextInt();
            arrayList.add(element);
            linkedList.add(element);
        }

        // Reverse the ArrayList and LinkedList
        Reverse.reverseArrayList(arrayList);
        Reverse.reverseLinkedList(linkedList);

        // Print the reversed lists
        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}