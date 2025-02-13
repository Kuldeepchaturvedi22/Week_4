package com.ListInterface.RotateElementsInList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt user to enter length of list
        System.out.println("Enter length of list : ");
        int length = sc.nextInt();
        // Prompt user to enter rotation number
        System.out.println("Enter rotation number : ");
        int rotationNumber = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        // Prompt user to enter all integers
        System.out.println("Enter all numbers : ");
        for (int i = 0; i < length; i++) {
            int input = sc.nextInt();
            list.add(input);
        }
        // Rotate the list by the given rotation number
        System.out.println(Rotate.rotateList(list, rotationNumber));
    }
}