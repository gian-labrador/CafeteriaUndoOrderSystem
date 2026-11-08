
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
}