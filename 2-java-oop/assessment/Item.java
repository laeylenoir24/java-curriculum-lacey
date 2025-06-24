package assessment;

public class Item {
    public int quantity;
    String name;
    double price;
    int quantityAvailable;

    public Item(String name, double price, int quantityAvailable) {
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void reduceQuantity(int quantity) {
        if (quantity <= quantityAvailable) {
            quantityAvailable -= quantity;
        }
    }

    public void increaseQuantity(int quantity) {
        quantityAvailable += quantity;
    }

    @Override
    public String toString() {
        return String.format("%s - $%.2f (Available: %d)", name, price, quantityAvailable);
    }
}
