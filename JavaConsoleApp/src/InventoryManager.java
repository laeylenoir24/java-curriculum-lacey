import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;



public class InventoryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inventory = new ArrayList<>();

        while (true) {
            System.out.println("Inventory Manager");
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



    public static class Product {
        private static int productID;
        private static String productName;
        private static int quantity;
        private static BigDecimal price;

        public Product(String productName, int quantity, BigDecimal price) {
        }

    }
}
