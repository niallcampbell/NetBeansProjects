package menus;

public class FastFoodMenuFactory extends FoodMenuFactory {
    
    @Override
    public Menu createMenu() {
        return new FastFoodMenu("McDonalds");
    }
    
}
