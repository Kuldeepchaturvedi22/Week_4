package com.ListInterface.FindNthElementFromEnd;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter the length of the linked list
        int length = scanner.nextInt();
        // Prompt user to enter the index from the end
        int index = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Prompt user to enter all integers
        for (int i = 0; i < length; i++) {
            linkedList.add(scanner.nextInt());
        }
        // Find and print the nth element from the end
        System.out.println(FindElement.findNthElement(linkedList, index));
    }
}