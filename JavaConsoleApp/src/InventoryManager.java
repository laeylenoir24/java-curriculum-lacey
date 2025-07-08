import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static objects.ConsoleUI.scanner;


public class InventoryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path = Path.of("JavaConsoleApp/src/data/Inventory.txt");

        while (true) {
            System.out.println("Inventory Manager");
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Update product price");
            System.out.println("4. View inventory");
            System.out.println("5. Exit");

            path = Paths.get("")

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
            String productName = scanner.nextLine();

            System.out.println("Enter product quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            if (productName != null) {
                inventory.remove(productName);
                System.out.println("Product removed");
            } else {
                System.out.println("Product not found.");
            }

        }

        private static void updatePrice() {
            System.out.println("You are about to make a price update. Enter the product's name: ");
            String productName = scanner.nextLine();

            if (productName != null) {
                System.out.println("Enter the updated price: ");
                BigDecimal newPrice = new BigDecimal(scanner.nextLine());
                System.out.println("Price updated.");
            } else {
                System.out.println("Product not found.");
            }

        }

        private static void viewInventory() {
            if (inventory.isEmpty()) {
                System.out.println("Nothing to see here.");
            } else {
                System.out.println("Inventory: ");
                for (String productName : inventory) {
                    System.out.println(productName);
                }
            }
        }


    public static class Product {
        private static int productID;
        private static String productName;
        private static int quantity;
        private static BigDecimal price;

        public Product(String productName, int quantity, BigDecimal price) {
            this.productID = productID++;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        public static int getProductID() {
            return productID;
        }

        public static void setProductID(int productID) {
            Product.productID = productID;
        }

        public static String getProductName() {
            return productName;
        }

        public static void setProductName(String productName) {
            Product.productName = productName;
        }

        public static int getQuantity() {
            return quantity;
        }

        public static void setQuantity(int quantity) {
            Product.quantity = quantity;
        }

        public static BigDecimal getPrice() {
            return price;
        }

        public static void setPrice(BigDecimal price) {
            Product.price = price;
        }

    }

}
