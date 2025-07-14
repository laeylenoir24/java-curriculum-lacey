package model;

import java.math.BigDecimal;

public class Product {
    private static int startingID = 1;
    private int productID;
    private String productName;
    private int quantity;
    private BigDecimal price;

    public Product(String productName, int quantity, BigDecimal price) {
        this.productID = startingID++;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getStartingID() {
        return startingID;
    }

    public void setStartingID(int startingID) {
        this.startingID = startingID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

