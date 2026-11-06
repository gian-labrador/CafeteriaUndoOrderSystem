
package CafeteriaSystem;

public class UndoAction {
     
    private String actionType;
    private OrderItem item;
    private int index;
    
    public UndoAction(String actionType,
        OrderItem item, int index) {

        this.actionType = actionType;
        this.item = item;
        this.index = index;
    }
    
    public String getActionType() {
        return actionType;
    }
    
    public OrderItem getItem() {
        return item;
    }

    public int getIndex() {
        return index;
    }

}
