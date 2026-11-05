
package CafeteriaSystem;

public class FoodItem {
    
    public FoodItem(String name, double price) {
        super(name, price);
    }
    
    @Override
    public String getCategory() {
        return "Food";
    }
}
