package com.SmartWarehouseManagementSystem;

import java.util.List;

// Abstract class representing a warehouse item
public abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to display all items in storage
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.name);
            System.out.println(item.price);
            System.out.println();
        }
    }
}