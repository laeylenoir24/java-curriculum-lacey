package lists;

public class Action {
    MenuItem menuitem;
    boolean addToOrder;

    public Action(MenuItem menuitem, boolean addToOrder) {
        this.menuitem = menuitem;
        this.addToOrder = addToOrder;
    }

    public MenuItem getMenuitem() {
        return menuitem;
    }

    public void setMenuitem(MenuItem menuitem) {
        this.menuitem = menuitem;
    }

    public boolean isAddToOrder() {
        return addToOrder;
    }

    public void setAddToOrder(boolean addToOrder) {
        this.addToOrder = addToOrder;
    }
}
