package service;

import model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;

public class InventoryService {
    private final ArrayList<Product> inventory = new ArrayList<>();

    public void addProduct(String productName, int quantity, BigDecimal price) {
        Product product = new Product(productName, quantity, price);
        inventory.add(product);
        System.out.println("Product added: " + product);
    }

    public void removeProduct(String productName) {
        Product toRemove = findByProductName(productName);
        if (toRemove != null) {
            inventory.remove(toRemove);
            System.out.println("Product removed");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void updatePrice(String productName, BigDecimal newPrice) {
        Product toUpdate = findByProductName(productName);
        if (toUpdate != null) {
            toUpdate.setPrice(newPrice);
            System.out.println("Price updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Nothing to see here!");
        } else {
            System.out.println("Current inventory:\n");
            for (Product products : inventory) {
                System.out.println(products);
            }
        }
    }

    private Product findByProductName(String productName) {
        for (Product products : inventory) {
            if (products.getProductName().equalsIgnoreCase(productName)) {
                return products;
            }
        }
        return null;
    }
}
