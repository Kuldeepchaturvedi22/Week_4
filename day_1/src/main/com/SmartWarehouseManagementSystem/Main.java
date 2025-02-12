package com.SmartWarehouseManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create instances of different types of items
        Electronics electronics = new Electronics("Radio", 1000);
        Groceries groceries = new Groceries("Apple", 25);
        Furniture furniture = new Furniture("Table", 1200);

        // Create storage for warehouse items
        Storage<WarehouseItem> storage = new Storage<>();

        // Add items to the storage
        storage.addItem(electronics);
        storage.addItem(groceries);
        storage.addItem(furniture);

        // Display items in the storage
        WarehouseItem.displayItems(storage.getItems());
    }
}