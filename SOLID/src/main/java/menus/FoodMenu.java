package menus;

public abstract class FoodMenu implements Menu {
    
    private static final String MENU_TYPE = "Food Menu";
    
    public String getMenuType() {
        return MENU_TYPE;
    }
    
}
