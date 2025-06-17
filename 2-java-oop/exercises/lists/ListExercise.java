package lists;

import objects.ConsoleUI;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

//I get a null exception error when I run it. I don't know how to fix it.
//I tried changing the value of menuItem in OrderManger but that caused syntax errors across other classes.

public class ListExercise extends OrderManager implements ConsoleUI {
    public ListExercise(int currentOrderNumber, ArrayList<MenuItem> currentOrder, Stack<Action> undoActions, Stack<Action> redoActions, Queue<MenuItem> kitchenQueue) {
        super(currentOrderNumber, currentOrder, undoActions, redoActions, kitchenQueue);
    }

    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        MenuItem burger = new MenuItem(1, "Burger", 200);
        MenuItem fries = new MenuItem(2, "Fries", 202);
        MenuItem soda = new MenuItem(3, "Soda", 204);
        MenuItem iceCream = new MenuItem(4, "Ice cream", 206);

        System.out.println("SERVER MENU SYSTEM");
        System.out.println("1. Add burger");
        System.out.println("2. Add fries");
        System.out.println("3. Add soda");
        System.out.println("4. Add ice cream");

        while (true) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                orderManager.addToOrder(burger);
            } else if (choice == 2) {
                orderManager.addToOrder(fries);
            } else if (choice == 3) {
                orderManager.addToOrder(soda);
            } else if (choice == 4) {
                orderManager.addToOrder(iceCream);
            } else if (choice == 5) {
                orderManager.confirmOrder();
            } else if (choice == 6) {
                System.out.println("Yummy!!");
                break;
            } else {
                System.out.println("Yuck. Try again.");
        }
        }

    }
}
