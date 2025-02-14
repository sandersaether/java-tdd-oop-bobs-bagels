package com.booleanuk.core;

public class Product {
    private String sku;
    private double price;
    private String name;
    private String variant;

    public int quantity;

    public Product(String sku, double price, String name, String variant) {
        this.sku = sku;
        this.price = price;
        this.name = name;
        this.variant = variant;
    }
    public Product(String sku, double price, String name, String variant, int quantity) {
        this.sku = sku;
        this.price = price;
        this.name = name;
        this.variant = variant;
        this.quantity = quantity;
    }

    public String getSku() {
        return sku;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getVariant() {
        return variant;
    }
    public int getQuantity() {
        return quantity;
    }
}
