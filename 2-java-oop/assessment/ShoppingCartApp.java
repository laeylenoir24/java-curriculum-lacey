import assessment.Cart;
import assessment.Discount;
import assessment.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static objects.ConsoleUI.scanner;

public abstract class ShoppingCartProgram implements Discount {
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
}

static void handleApplyDiscount() {
}

static void handleRemoveItem() {
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


