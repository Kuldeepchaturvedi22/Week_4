package com.ImplementBankingSystem;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.TreeMap;

public class BankingSystem {
    public static void main(String[] args) {
        HashMap<String, Double> accountsMap1 = new HashMap<>(); // to store account numbers associated with their balance
        TreeMap<Double, String> accountsMap2 = new TreeMap<>(); // accounts to be sorted according to their balances
        Queue<String> withdrawalAccounts = new ArrayDeque<>(); // queue to store accounts with withdrawal requests
        Queue<Double> withdrawalAmounts = new ArrayDeque<>(); // queue to store withdrawal amounts

        // adding data in map
        accountsMap1.put("AC-01", 1000.0);
        accountsMap1.put("AC-02", 800.0);
        accountsMap1.put("AC-03", 2000.0);
        accountsMap1.put("AC-04", 1100.0);
        accountsMap1.put("AC-05", 1050.0);

        // sorting data by adding it inside tree map
        accountsMap1.forEach((key, value) -> accountsMap2.put(value, key));

        // printing the account maps
        System.out.println("HashMap: " + accountsMap1);
        System.out.println("TreeMap: " + accountsMap2);

        // enqueuing withdrawal requests
        withdrawalAccounts.add("AC-01");
        withdrawalAmounts.add(200.0);

        withdrawalAccounts.add("AC-02");
        withdrawalAmounts.add(200.0);

        withdrawalAccounts.add("AC-03");
        withdrawalAmounts.add(200.0);

        withdrawalAccounts.add("AC-02");
        withdrawalAmounts.add(200.0);

        withdrawalAccounts.add("AC-05");
        withdrawalAmounts.add(200.0);

        withdrawalAccounts.add("AC-04");
        withdrawalAmounts.add(2000.0);

        withdrawalAccounts.add("AC-01");
        withdrawalAmounts.add(1900.0);

        withdrawalAccounts.add("AC-03");
        withdrawalAmounts.add(200.0);

        // analyzing withdrawal requests and confirming withdrawal
        while (!withdrawalAccounts.isEmpty() && !withdrawalAmounts.isEmpty()) {
            if (accountsMap1.get(withdrawalAccounts.peek()) - withdrawalAmounts.peek() >= 0) {
                accountsMap1.put(withdrawalAccounts.peek(), accountsMap1.get(withdrawalAccounts.peek()) - withdrawalAmounts.peek());
                System.out.println("Amount Withdrawn.");
            } else {
                System.out.println("Insufficient Balance.");
            }
            // removing data from withdrawal queue
            withdrawalAccounts.remove();
            withdrawalAmounts.remove();
        }

        // clearing the tree map and again sorting the accounts data according to their balances
        accountsMap2.clear();
        accountsMap1.forEach((key, value) -> accountsMap2.put(value, key));

        // displaying the account maps
        System.out.println("HashMap: " + accountsMap1);
        System.out.println("TreeMap: " + accountsMap2);
    }
}