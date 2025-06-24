import assessment.Cart;
import assessment.Discount;
import assessment.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

private static void exitProgram() {
}

private static void handleCheckout() {
}

private static void handleApplyDiscount() {
}

private static void handleRemoveItem() {
}

private static void handleAddItem() {
}


void main() {
}


