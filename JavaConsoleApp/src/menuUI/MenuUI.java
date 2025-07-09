package menuUI;

import model.Product;
import service.InventoryService;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;

import static objects.ConsoleUI.scanner;


public class MenuUI {
    public static ArrayList<Product> inventory = new ArrayList<>();
    private static final InventoryService manager = new InventoryService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("User Menu\n");
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Update product price");
            System.out.println("4. View inventory");
            System.out.println("5. Exit");


            String input = scanner.nextLine();

            if (input.equals("1")) {
                addProduct();
            } else if (input.equals("2")) {
                removeProduct();
            } else if (input.equals("3")) {
                updatePrice();
            } else if (input.equals("4")) {
                viewInventory();
            } else if (input.equals("5")) {
                System.out.println("Bye for now!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }

        }
    }

    private static void addProduct() {
        System.out.println("You are about to add a product. Enter the product's name: ");
        String productName = scanner.nextLine();

        System.out.println("Enter product quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter product price per unit: ");
        BigDecimal price = new BigDecimal(scanner.nextLine());
        Product product = new Product(productName, quantity, price);
        System.out.println("Product " + product.getProductID());
    }

    private static void removeProduct() {
        System.out.println("You are about to remove a product. Enter the product's name: ");
        String nameToRemove = scanner.nextLine();
        Product toRemove = null;

        for (Product products : inventory) {
            if (products.getProductName().equalsIgnoreCase(nameToRemove)) {
                toRemove = products;
                break;
            }
        }

        if (toRemove != null) {
            inventory.remove(toRemove);
            System.out.println("Product removed.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void updatePrice() {
        System.out.println("You are about to make a price update. Enter the product's name: ");
        String nameToUpdate = scanner.nextLine();

        for (Product products : inventory) {
            if (products.getProductName().equalsIgnoreCase(nameToUpdate)) {
                System.out.println("Enter the new price: ");
                BigDecimal newPrice = new BigDecimal(scanner.nextLine());
                products.setPrice(newPrice);
                System.out.println("Price updated.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    private static void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Nothing to see here.");
        } else {
            System.out.println("Current Inventory:\n");
        } for (Product products : inventory) {
            System.out.println(products);
        }
    }


}
