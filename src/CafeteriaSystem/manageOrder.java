
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
    
    private void loadMenu() {
    // Food
    addMenuItem(new FoodItem("Rice", 15.00));
    addMenuItem(new FoodItem("Fried Chicken", 45.00));
    addMenuItem(new FoodItem("Adobo", 30.00));
    addMenuItem(new FoodItem("Pancit Bihon", 25.00));
    addMenuItem(new FoodItem("Lumpia", 10.00));
    addMenuItem(new FoodItem("Hotdog", 10.00));
    addMenuItem(new FoodItem("Nuggets", 15.00));
    addMenuItem(new FoodItem("Egg", 10.00));
    addMenuItem(new FoodItem("Sisig", 35.00));
    addMenuItem(new FoodItem("Siomai", 20.00));
    addMenuItem(new FoodItem("Burger", 30.00));

    // Drinks
    addMenuItem(new DrinkItem("Buko Juice", 25.00));
    addMenuItem(new DrinkItem("Buko Pandan", 10.00));
    addMenuItem(new DrinkItem("Gulaman Drink", 15.00));
    addMenuItem(new DrinkItem("Juicy Lemon", 25.00));
    addMenuItem(new DrinkItem("Coca Cola", 25.00));
    addMenuItem(new DrinkItem("Pineapple Juice", 25.00));
    addMenuItem(new DrinkItem("Lemonade", 25.00));
    addMenuItem(new DrinkItem("Chuckie", 20.00));
    addMenuItem(new DrinkItem("Minute Maid", 20.00));
    addMenuItem(new DrinkItem("Mango Shake", 20.00));
    addMenuItem(new DrinkItem("Water", 10.00));
    }
    
    private void addMenuItem(OrderItem item) {

        if (menuCount < menu.length) {
            menu[menuCount] = item;
            menuCount++;
        }
    }

}
