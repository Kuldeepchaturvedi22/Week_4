package com.SetInterface.UnionAndIntersectionOfTwoSets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the size of the first set
        System.out.println("Enter the size of the first set:");
        int size1 = scanner.nextInt();
        Set<Integer> set1 = new HashSet<>();
        System.out.println("Enter elements of the first set:");
        for (int i = 0; i < size1; i++) {
            set1.add(scanner.nextInt());
        }

        // Prompt user to enter the size of the second set
        System.out.println("Enter the size of the second set:");
        int size2 = scanner.nextInt();
        Set<Integer> set2 = new HashSet<>();
        System.out.println("Enter elements of the second set:");
        for (int i = 0; i < size2; i++) {
            set2.add(scanner.nextInt());
        }

        // Compute the union of the two sets and print
        Set<Integer> union = UnionAndIntersection.union(set1, set2);
        System.out.println("Union: " + union);

        // Compute the intersection of the two sets and print
        Set<Integer> intersection = UnionAndIntersection.intersection(set1, set2);
        System.out.println("Intersection: " + intersection);
    }
}