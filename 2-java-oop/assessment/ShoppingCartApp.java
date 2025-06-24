import assessment.Cart;
import assessment.Discount;
import assessment.Item;
import assessment.PercentageDiscount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static assessment.Cart.cart;
import static assessment.Cart.items;
import static objects.ConsoleUI.scanner;

public abstract static class ShoppingCartProgram implements Discount {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, Item> inventory = new HashMap<>();
    static Cart cart = new Cart();


    }

static void runMenuChoice(String choice) {
    if (choice.equals("1")) ShoppingCartProgram.cart.display();
    else if (choice.equals("2")) handleAddItem();
    else if (choice.equals("3")) handleRemoveItem();
    else if (choice.equals("4")) handleApplyDiscount();
    else if (choice.equals("5")) handleCheckout();
    else if (choice.equals("6")) exitProgram();
    else System.out.println("Invalid. Try again");
    }




static void startInventory() {
    ShoppingCartProgram.inventory.put("Barbie", new Item("Barbie",10.99, 20));
    ShoppingCartProgram.inventory.put("Hot Wheels", new Item("Hot Wheels", 2.99, 15));
    ShoppingCartProgram.inventory.put("Yoyo", new Item("Yoyo", 0.99, 10));
    ShoppingCartProgram.inventory.put("Bread", new Item("Bread", 1.99, 8));

}

static void displayMenu() {
    System.out.println("\n-- Main Menu --");
    System.out.println("1. Display Cart");
    System.out.println("2. Add an Item");
    if (!ShoppingCartProgram.cart.isEmpty()) {
        System.out.println("3. Remove an Item");
        System.out.println("4. Add a Discount");
        System.out.println("5. Check Out");
    } else {
        System.out.println("3. [Unavailable: Cart is empty]");
        System.out.println("4. Add a Discount");
        System.out.println("5. [Unavailable: Cart is empty]");
    }
    System.out.println("6. Exit");
    System.out.print("Choose an option: ");
}

static void exitProgram() {
}

static void handleCheckout() {
    if (ShoppingCartProgram.cart.isEmpty()) {
        System.out.println("Cannot checkout an empty cart.");
        return;
    }

    System.out.println("\n-- Receipt --");
    for (Item item : cart.items) {
        double lineTotal = item.getPrice() * item.quantity;
        System.out.printf("%s x%d: $%.2f\n", item.getName(), item.quantity, lineTotal);
    }

    System.out.printf("Subtotal: $%.2f\n", ShoppingCartProgram.cart.getSubtotal());

    if (ShoppingCartProgram.cart.discount != null) {
        System.out.printf("Discount (%s): -$%.2f\n", ShoppingCartProgram.cart.discount.getDescription(), ShoppingCartProgram.cart.getDiscountAmount());
    }

    System.out.printf("Total Due: $%.2f\n", ShoppingCartProgram.cart.getTotal());

    ShoppingCartProgram.cart.clear();

    System.out.println("Thank you for your purchase!");
}


static void handleApplyDiscount() {
    if ((ShoppingCartProgram.cart.discount == PercentageDiscount.BOGODiscount.parseBOGODiscount(null))) {
        System.out.println("\n-- Discount Options --");
        System.out.println("1. 10% Off");
        System.out.println("2. BOGO (Buy One Get One)");
        System.out.println("3. Cancel");
        System.out.print("Select discount type: ");
        String input = scanner.nextLine();
        if (input.equals("1")) ShoppingCartProgram.cart.discount = new PercentageDiscount.BOGODiscount();
        else if (input.equals("2")) ShoppingCartProgram.cart.discount = new PercentageDiscount.BOGODiscount();
        else if (input.equals("3")) {
            System.out.println("No discount applied.");
            return;
        } else {
            System.out.println("Invalid choice.");
            return;
        }
        System.out.println("Discount applied: " + ShoppingCartProgram.cart.discount.getDescription());
    } else {
        System.out.println("A discount has already been applied.");
        return;
    }
}

static void handleRemoveItem() {
    if (ShoppingCartProgram.cart.isEmpty()) {
        System.out.println("Cart is empty. Nothing to remove.");
        return;
    }
    ShoppingCartProgram.cart.display();
    System.out.print("Enter item name to remove: ");
    String name = scanner.nextLine();
    Item inCart = null;
    Item[] items = new Item[0];
    for (Item item : items) {
        if (item.getName().equals(name)) {
            inCart = item;
            break;
        }
    }
    if (inCart == null) {
        System.out.println("Item not in cart.");
        return;
    }
    System.out.print("Enter quantity to remove: ");
    int qty = Integer.parseInt(scanner.nextLine());
    if (qty > inCart.quantity) {
        System.out.println("Cannot remove more than is in cart.");
        return;
    }
    ShoppingCartProgram.cart.removeItem(name, qty);
    ShoppingCartProgram.inventory.get(name).quantity += qty;
    System.out.printf("Removed %d x %s from cart.\n", qty, name);
}

static void handleAddItem() {
    System.out.println("\n-- Available Items --");
    for (Item item : ShoppingCartProgram.inventory.values())
        System.out.printf("%s - $%.2f (%d in stock)\n", item.getName(), item.getPrice(), item.quantity);
    System.out.print("Enter item name to add: ");
    String name = scanner.nextLine();
    Item item = ShoppingCartProgram.inventory.get(name);
    if (item == null) {
        System.out.println("Item not found.");
        return;
    }
    if (item.quantity == 0) {
        System.out.println("Out of stock.");
        return;
    }
    System.out.print("Enter quantity to add: ");
    int qty = Integer.parseInt(scanner.nextLine());
    if (qty > item.quantity) {
        System.out.println("Not enough in stock.");
        return;
    }
    item.quantity -= qty;
    ShoppingCartProgram.cart.addItem(item, qty);
    System.out.printf("Added %d x %s to cart.\n", qty, item.getName());
}


void main() {
}


