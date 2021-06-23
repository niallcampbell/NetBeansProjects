package menus;

public class PubMenuFactory extends DrinksMenuFactory {
    
    @Override
    public Menu createMenu() {
        return new PubMenu("Village Inn");
    }
    
}
