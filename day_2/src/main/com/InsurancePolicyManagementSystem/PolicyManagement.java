package com.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManagement {
    void retrievePolicy(HashMap<String, Policy> policyHashMap, String policyNumber) {
        if (!policyHashMap.containsKey(policyNumber)) {
            System.out.println("Policy Does Not Exist!");
            return;
        }

        Policy obj = policyHashMap.get(policyNumber);
        System.out.println("Holder Name: " + obj.getHolderName() + "\nExpiry Date: " + obj.getExpiryDate());
    }

    void expiryChecker(TreeMap<LocalDate, String> policyTreeMap) {
        policyTreeMap.forEach((key, value) -> {
            if (key.isBefore(LocalDate.now().plusDays(30))) {
                System.out.println(value + " is going to expire in 30 days.");
            }
        });
        System.out.println("No More Policies Are Going To Be Expired In 30 Days.");
    }

    void listAll(HashMap<String, Policy> policy1, TreeMap<LocalDate, String> policy2, LinkedHashMap<String, Policy> policy3, String person) {
        // Clear HashMap and TreeMap
        policy1.clear();
        policy2.clear();

        // Use an Iterator to safely modify policy3
        Iterator<Map.Entry<String, Policy>> iterator = policy3.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Policy> entry = iterator.next();
            String key = entry.getKey();
            Policy value = entry.getValue();

            // Insert values into the other maps
            policy1.put(person, value);
            policy2.put(value.getExpiryDate(), person);

            // Remove from policy3 using Iterator
            iterator.remove();
        }
    }

    void removeExpirePolicies(HashMap<String,Policy>policy1, TreeMap<LocalDate,String>policy2, LinkedHashMap<String,Policy>policy3) {
        policy2.forEach((key, value) -> {
            if(key.isBefore(LocalDate.now())) {
                policy1.remove(value);
                policy3.remove(value);
                policy2.remove(key);
            }
        });
    }
}
