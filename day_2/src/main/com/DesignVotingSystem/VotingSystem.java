package com.DesignVotingSystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class VotingSystem {
    public static void main(String[] args) {
        // created a LinkedHashMap to store the candidates associated with their votes
        String candidate1 = "Ram", candidate2 = "Shyam", candidate3 = "Mohan";
        LinkedHashMap <String, Integer> votes1 = new LinkedHashMap<>();

        // adding candidate into map
        votes1.put(candidate1, 0);  votes1.put(candidate2, 0);  votes1.put(candidate3, 0);

        // taking inputs for votes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Voters:");
        int numberOfVoters = sc.nextInt();

        for (int i = 0; i < numberOfVoters; i++) {
            System.out.println("Vote To: 1) " + candidate1 + ", 2) " + candidate2 + ", 3) " + candidate3);
            int voteTo = sc.nextInt();
            if(voteTo == 1){
                votes1.put(candidate1, votes1.get(candidate1)+1);
                continue;
            }
            if(voteTo == 2){
                votes1.put(candidate2, votes1.get(candidate2)+1);
                continue;
            }
            if(voteTo == 3){
                votes1.put(candidate3, votes1.get(candidate3)+1);
            }
        }

        // created TreeMap and LinkedHashMap to manage the candidates votes order
        HashMap <String, Integer> votes2 = new HashMap<>(votes1);
        TreeMap <String, Integer> votes3 = new TreeMap<>(votes1);

        // displaying the mapping of votes
        System.out.println("Linked Hash Map of votes: " + votes1);
        System.out.println("Tree Map of votes: " + votes2);
        System.out.println("Hash Map of votes: " + votes3);
    }
}
