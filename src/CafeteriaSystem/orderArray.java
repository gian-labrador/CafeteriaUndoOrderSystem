
package CafeteriaSystem;

public class orderArray {
    
    private OrderItem[] items;
    private int count;

    public orderArray() {
        items = new OrderItem[100];
        count = 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean add(OrderItem item) {

        if (isFull()) {
            return false;
        }

        items[count] = item;
        count++;

        return true;
    }
    
    public OrderItem get(int index) {

        if (index < 0 || index >= count) {
            return null;
        }

        return items[index];
    }

    public int size() {
        return count;
    }

    public OrderItem removeAt(int index) {

        if (index < 0 || index >= count) {
            return null;
        }

        OrderItem removed = items[index];

        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

        items[count - 1] = null;
        count--;

        return removed;
    }
    
    public boolean insertAt(int index, OrderItem item) {

        if (isFull() || index < 0 || index > count) {
            return false;
        }

        for (int i = count; i > index; i--) {
            items[i] = items[i - 1];
        }

        items[index] = item;
        count++;

        return true;
    }
    
}