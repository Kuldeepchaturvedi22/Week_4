package com.SmartWarehouseManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Generic class to store items safely
public class Storage<T extends WarehouseItem> {
    private List<T> items;

    // Constructor to initialize the storage with an empty list
    public Storage() {
        items = new ArrayList<>();
    }

    // Method to add an item to the storage
    public void addItem(T item) {
        items.add(item);
    }

    // Method to get all items in the storage
    public List<T> getItems() {
        return items;
    }
}