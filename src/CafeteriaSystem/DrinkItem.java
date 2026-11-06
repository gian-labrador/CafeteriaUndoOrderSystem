
package CafeteriaSystem;

public class DrinkItem {
    
    public DrinkItem(String name, double price) {
        super(name, price);
    }
    
    @Override
    public String getCategory() {
        return "Drink";
    }  
}
