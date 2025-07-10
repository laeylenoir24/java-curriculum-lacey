import model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.InventoryService;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryTesting {

    private InventoryService service;

    @BeforeEach
    public void setUp() {
        ArrayList<Product> initialInventory = new ArrayList<>();
        initialInventory.add(new Product("Apple", 10, new BigDecimal("1.99")));
        service = new InventoryService(initialInventory);
    }

    @Test
    public void testAddProduct() {
        service.addProduct("Banana", 5, new BigDecimal("0.89"));
        Product banana = service.findByProductName("Banana");
        assertNotNull(banana);
        assertEquals(2, service.getInventory().size());
        assertEquals(new BigDecimal("0.89"), banana.getPrice());
    }

    @Test
    public void testRemoveProductFound() {
        service.removeProduct("Apple");
        Product apple = service.findByProductName("Apple");
        assertNull(apple);
        assertEquals(0, service.getInventory().size());
    }

    @Test
    public void testRemoveProductNotFound() {
        service.removeProduct("Orange");
        assertEquals(1, service.getInventory().size());
    }

    @Test
    public void testUpdatePriceFound() {
        service.updatePrice("Apple", new BigDecimal("2.49"));
        Product apple = service.findByProductName("Apple");
        assertNotNull(apple);
        assertEquals(new BigDecimal("2.49"), apple.getPrice());
    }

    @Test
    public void testUpdatePriceNotFound() {
        service.updatePrice("Orange", new BigDecimal("1.49"));
        Product orange = service.findByProductName("Orange");
        assertNull(orange);
        assertEquals(1, service.getInventory().size());
    }

    @Test
    public void testFindByProductName() {
        Product apple = service.findByProductName("APPLE");
        assertNotNull(apple);
        assertEquals("Apple", apple.getProductName());
   }
}