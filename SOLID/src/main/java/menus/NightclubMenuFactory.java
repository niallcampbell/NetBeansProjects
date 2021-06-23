package menus;

public class NightclubMenuFactory extends DrinksMenuFactory {
    
    @Override
    public Menu createMenu() {
        return new NightclubMenu("Mantra");
    }
    
}
