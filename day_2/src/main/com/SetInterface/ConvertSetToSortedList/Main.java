package com.SetInterface.ConvertSetToSortedList;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the size of the set
        System.out.println("Enter the size of the set:");
        int size = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        System.out.println("Enter elements of the set:");
        for (int i = 0; i < size; i++) {
            set.add(scanner.nextInt());
        }

        // Convert the set to a sorted list and print
        List<Integer> sortedList = ConvertToSortedList.convertSetToSortedList(set);
        System.out.println("Sorted list: " + sortedList);
    }
}