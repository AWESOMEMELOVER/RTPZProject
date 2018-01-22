package com.micka.borscha.Entities;

public class Product {

    private float productId;
    private String title;
    private int quantity;
    private int minimum;

    public Product(String title, int quantity, int minimum) {
        this.title = title;
        this.quantity = quantity;
        this.minimum = minimum;
    }

    public Product(float productId, String title, int quantity, int minimum) {
        this.productId = productId;
        this.title = title;
        this.quantity = quantity;
        this.minimum = minimum;
    }

    public float getProductId() {
        return productId;
    }

    public void setProductId(float productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
