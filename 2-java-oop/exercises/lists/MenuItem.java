package lists;

public class MenuItem {
    private int itemNumber;
    private String itemName;
    private int orderNumber;

    public MenuItem(int itemNumber, String itemName, int orderNumber) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.orderNumber = orderNumber;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
