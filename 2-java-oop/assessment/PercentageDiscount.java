package assessment;

import java.util.ArrayList;
import java.util.List;

public class PercentageDiscount implements Discount {
    private final double percent = 0.10;

    @Override
    public double getDiscount(List<Item> items) {
        double subtotal = 0.0;
        for (Item item : items) {
            subtotal += item.price * item.quantity;
        }
        return subtotal * percent;
    }

    @Override
    public String getDescription() {
        return "10% off";
    }

    public static class BOGODiscount implements Discount {
        private List<Item> items;

        public static BOGODiscount parseBOGODiscount(Object o) {
            return null;
        }

        public double getDiscount() {
            return getDiscount((List<Item>) null);
        }

        @Override
        public double getDiscount(List<Item> items) {
            this.items = items;
            double discount = 0.0;
            for (Item item : items) {
                int freeItems = item.quantity / 2;
                discount += freeItems * item.price;
            }

            return discount;
        }

        @Override
        public String getDescription() {
            return "Buy one, get one free!";
        }
    }

    class Item {
        String name;
        double price;
        int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

    class Cart {
        List<Item> items = new ArrayList<>();
        Discount discount;

        void addItem(Item item, int quantity) {
            for (Item cartItem : items) {
                if (cartItem.name.equals(item.name)) {
                    cartItem.quantity += quantity;
                    return;
                }
            }

            items.add(new Item(item.name, item.price, quantity));
        }

        void removeItem(String name, int quantity) {
            items.removeIf(item -> {
                if (item.name.equals(name)) {
                    if (item.quantity <= quantity)
                        return true;
                    item.quantity -= quantity;
                }

                return false;
            });
        }

        double getSubtotal() {
            double subtotal = 0.0;
            for (Item i : items) {
                subtotal += i.price * i.quantity;
            }

            return subtotal;
        }

        double getDiscountAmount() {
            return discount == null ? 0 : discount.getDiscount(items);
        }

        double getTotal() {
            return getSubtotal() - getDiscountAmount();
        }

        boolean isEmpty() {
            return items.isEmpty();
        }

        void clear() {
            items.clear();
            discount = null;
        }

        void display() {
            System.out.println("\n Items in cart:");
            if (items.isEmpty()) {
                System.out.println("Cart is empty");
                return;
            }

            for (Item item : items) {
                System.out.printf("%s x%d @ $%.2f each\n", item.name, item.quantity, item.price);
            }
            System.out.printf("Subtotal: $%.2f\n", getSubtotal());
            if (discount != null) {
                System.out.printf("Discount (%s): -$%.2f\n", discount.getDescription(), getDiscountAmount());
            }
            System.out.printf("Total: $%.2f\n", getTotal());
        }
    }
}
