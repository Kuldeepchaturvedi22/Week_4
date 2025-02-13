package com.ImplementShoppingCart;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        // created a LinkedHashMap to store the products associated with their prices and maintaining the order
        LinkedHashMap<String, Integer> products1 = new LinkedHashMap<>();

        // taking inputs for product names associated with prices
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products:");
        int numberOfProducts = sc.nextInt();

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Enter name of product");
            String name = sc.nextLine(); // to avoid conflicts while taking string input
            name = sc.nextLine();
            System.out.println("Enter Price: ");
            int price = sc.nextInt();

            products1.put(name, price);
        }

        // created TreeMap and LinkedHashMap to manage the products order
        HashMap<String, Integer> products2 = new HashMap<>(products1);
        TreeMap<Integer, String> products3 = new TreeMap<>();

        products2.forEach((key, value) -> products3.put(value, key)); // it will be sorted according to price

        // displaying the mapping of products
        System.out.println("LinkedHash Map of prices: " + products1);
        System.out.println("HashMap of prices: " + products2);
        System.out.println("TreeMap of prices: " + products3);
    }
}
