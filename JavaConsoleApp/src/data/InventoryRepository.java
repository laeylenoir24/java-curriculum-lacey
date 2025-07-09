package data;

import model.Product;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static menuUI.MenuUI.inventory;

public class InventoryRepository {
    Path path = Path.of("JavaConsoleApp/src/data/Inventory.txt");

    public InventoryRepository(String path) {
        this.path = Path.of("JavaConsoleApp/src/data/Inventory.txt");
    }

    public void save(ArrayList<Product> inventory) {
        ArrayList<String> lines = new ArrayList<>();
        for (Product products : inventory) {
            lines.add(products.getProductName() + ", " + products.getQuantity() + ", " + products.getPrice());
        }
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            System.out.println("Error. Try again.");
        }
    }

    public ArrayList<Product> load() throws IOException {
        ArrayList<Product> inventory = new ArrayList<>();
        if (!Files.exists(path))
            return inventory;

        try {
            ArrayList<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                String[] parts = line.split(", ");
                if (parts.length == 3) {
                    String productName = parts[0];
                    int quantity = Integer.parseInt(parts[1]);
                    BigDecimal price = new BigDecimal(parts[2]);
                    inventory.add(new Product(productName, quantity, price));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}