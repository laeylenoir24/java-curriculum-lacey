package midterm;

import data.InventoryRepository;
import model.Product;
import service.InventoryService;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    ArrayList<Product> inventory = new ArrayList<>();
    private final InventoryService service;
    private final InventoryRepository repository;
    public InventoryManager(String path) {
        this.repository = new InventoryRepository(path);
        ArrayList<Product> loadedInventory = repository.load();
        this.service = new InventoryService(loadedInventory);
    }

    public InventoryService getService() {
        return service;
    }

    public void saveInventory() {
        repository.save(service.getInventory());
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public void removeProduct(String string, int i) {
    }

    public List<Product> getInventory() {
        return inventory;
    }
}
