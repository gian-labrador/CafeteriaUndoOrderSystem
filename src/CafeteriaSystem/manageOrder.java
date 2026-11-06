
package CafeteriaSystem;

public class manageOrder {
    
    private orderArray orders;
    private undoStack history;
    private OrderItem[] menu;
    private int menuCount;
  
    public manageOrder() {

        orders = new orderArray();
        history = new undoStack();

        menu = new OrderItem[100];
        menuCount = 0;

        loadMenu();
    }
    
}
