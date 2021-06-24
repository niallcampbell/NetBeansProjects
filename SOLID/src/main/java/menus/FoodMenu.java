package menus;

import java.util.List;
import java.util.ArrayList;

public class FoodMenu implements Menu {
    
    private static final String MENU_TYPE = "Food Menu";
    
    private final List<String> foodItems;
    
    public FoodMenu() {
        foodItems = new ArrayList<>();
        foodItems.add("Burger");
        foodItems.add("Steak");
        foodItems.add("Chicken");
        foodItems.add("Fries");
    }
    
    @Override
    public String getEstablishmentName() {
        return ESTABLISHMENT_NAME;
    }
    
    @Override
    public String getMenuType() {
        return MENU_TYPE;
    }
    
    @Override
    public void printMenuItems() {
        
        System.out.println("Food available:");
        
        for(String item : foodItems) {
            System.out.println(item);
        }
        
        System.out.println();
    }
    
    @Override
    public boolean itemAvailable(String item) {
        
        if(item == null) return false;
        
        return foodItems.contains(item);
    }
    
}
