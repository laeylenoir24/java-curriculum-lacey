package assessment;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    public static Object cart;
    public static Map<String, CartItem> items = new HashMap<>();
    public PercentageDiscount.BOGODiscount discount;

    public void addItem(Item item, int quantity) {
        if (item.getQuantityAvailable() < quantity) {
            System.out.println("Not enough stock.");
            return;
        }

        item.reduceQuantity(quantity);

        if (items.containsKey(item.getName())) {
            items.get(item.getName()).increaseQuantity(quantity);
        } else {
            items.put(item.getName(), new CartItem(item.getName(), item.getPrice(), quantity));
        }

        System.out.println(quantity + " " + item.getName() + "(s) added to cart.");
    }

    public void removeItem(String name, int quantity) {
        if (!items.containsKey(name)) {
            System.out.println("Item not in cart.");
            return;
        }

        CartItem cartItem = items.get(name);
        if (quantity >= cartItem.getQuantity()) {
            items.remove(name);
        } else {
            cartItem.decreaseQuantity(quantity);
        }

        System.out.println(quantity + " " + name + "(s) removed from cart.");
    }

    public void display() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\n-- Your Cart --");
        double total = 0;
        for (CartItem item : items.values()) {
            System.out.println(item);
            total += item.getPrice() * item.getQuantity();
        }
        System.out.printf("Total: $%.2f\n", total);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public Object getSubtotal() {
        return null;
    }

    public Object getTotal() {
        return null;
    }

    public void clear() {
    }

    public Object getDiscountAmount() {
        return null;
    }

    // Nested class for items in the cart
    private static class CartItem {
        private String name;
        private double price;
        private int quantity;

        public CartItem(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public void increaseQuantity(int qty) {
            this.quantity += qty;
        }

        public void decreaseQuantity(int qty) {
            this.quantity -= qty;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        @Override
        public String toString() {
            return String.format("%s - $%.2f x %d", name, price, quantity);
        }
    }
}

