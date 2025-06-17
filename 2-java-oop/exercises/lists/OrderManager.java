package lists;

import java.util.*;

public class OrderManager {
    private int currentOrderNumber;
    private ArrayList<MenuItem> currentOrder;
    private Stack<Action> undoActions;
    private Stack<Action> redoActions;
    private Queue<MenuItem> kitchenQueue;

    public OrderManager(int currentOrderNumber, ArrayList<MenuItem> currentOrder, Stack<Action> undoActions, Stack<Action> redoActions, Queue<MenuItem> kitchenQueue) {
        this.currentOrderNumber = 1;
        this.currentOrder = new ArrayList<>();
        this.undoActions = new Stack<>();
        this.redoActions = new Stack<>();
        this.kitchenQueue = new Queue<MenuItem>() {
            @Override
            public boolean add(MenuItem menuItem) {
                return false;
            }

            @Override
            public boolean offer(MenuItem menuItem) {
                return false;
            }

            @Override
            public MenuItem remove() {
                return null;
            }

            @Override
            public MenuItem poll() {
                return null;
            }

            @Override
            public MenuItem element() {
                return null;
            }

            @Override
            public MenuItem peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<MenuItem> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends MenuItem> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }

    public OrderManager() {

    }

    public int getCurrentOrderNumber() {
        return currentOrderNumber;
    }

    public void setCurrentOrderNumber(int currentOrderNumber) {
        this.currentOrderNumber = currentOrderNumber;
    }

    public ArrayList<MenuItem> getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(ArrayList<MenuItem> currentOrder) {
        this.currentOrder = currentOrder;
    }

    public Stack<Action> getUndoActions() {
        return undoActions;
    }

    public void setUndoActions(Stack<Action> undoActions) {
        this.undoActions = undoActions;
    }

    public Stack<Action> getRedoActions() {
        return redoActions;
    }

    public void setRedoActions(Stack<Action> redoActions) {
        this.redoActions = redoActions;
    }

    public Queue<MenuItem> getKitchenQueue() {
        return kitchenQueue;
    }

    public void setKitchenQueue(Queue<MenuItem> kitchenQueue) {
        this.kitchenQueue = kitchenQueue;
    }

    void addToOrder(MenuItem menuItem) {
        currentOrder.add(menuItem);
        undoActions.push(new Action(menuItem,true));
        redoActions.clear();
        System.out.println(menuItem.getItemName());
    }

    void removeFromOrder(MenuItem menuItem) {
        currentOrder.remove(menuItem);
        undoActions.push(new Action(menuItem, false));
        redoActions.clear();

    }

    void undo() {
        return;
    }

    void redo() {
        return;
    }

    void confirmOrder(){
        kitchenQueue.addAll(currentOrder);

        undoActions.clear();
        redoActions.clear();

        currentOrder.clear();
        currentOrderNumber++;

    }
}
