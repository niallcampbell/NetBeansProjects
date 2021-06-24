package menus;

public class FoodMenuFactory extends MenuFactory {
    
    public Menu createMenu() {
        return new FoodMenu();
    }
    
}