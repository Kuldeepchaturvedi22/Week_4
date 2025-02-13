package com.ListInterface.FindElementFrequency;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        // Prompt user to enter all strings
        System.out.println("Enter all strings : ");
        while (sc.hasNext()) {
            String input = sc.next();
            // Break the loop if the user enters "exit"
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            list.add(input);
        }

        // Find the frequency of each element in the list
        Map<String, Integer> hashMap = FindFrequency.frequency(list);

        // Print the frequency map
        System.out.println(hashMap);
    }
}