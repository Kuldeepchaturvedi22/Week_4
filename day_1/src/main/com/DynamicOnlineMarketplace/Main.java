package com.DynamicOnlineMarketplace;

public class Main {
    public static void main(String[] args) {
        // Create instances of different product categories
        BookCategory bookCategory = new BookCategory("Story");
        ClothingCategory clothingCategory = new ClothingCategory("Shirt");
        GadgetCategory gadgetCategory = new GadgetCategory("Smartphone");

        // Create instances of products
        Product<BookCategory> book = new Product<>("Panchtantra", 15.99, bookCategory);
        Product<ClothingCategory> shirt = new Product<>("Polo Shirt", 29.99, clothingCategory);
        Product<GadgetCategory> smartphone = new Product<>("iPhone", 999.99, gadgetCategory);

        // Apply discounts to products
        Product.applyDiscount(book, 10); // 10% discount
        Product.applyDiscount(shirt, 20); // 20% discount
        Product.applyDiscount(smartphone, 5); // 5% discount

        // Display updated prices
        System.out.println(book.getName() + " new price: " + book.getPrice());
        System.out.println(shirt.getName() + " new price: " + shirt.getPrice());
        System.out.println(smartphone.getName() + " new price: " + smartphone.getPrice());
    }
}