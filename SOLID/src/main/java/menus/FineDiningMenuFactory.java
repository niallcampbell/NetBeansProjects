package menus;

public class FineDiningMenuFactory extends FoodMenuFactory {
    
    @Override
    public Menu createMenu() {
        return new FineDiningMenu("Vesuvios");
    }
    
}
