package menus;

import java.util.List;
import java.util.ArrayList;

public class DrinksMenu implements Menu {
    
    private static final String MENU_TYPE = "Drinks Menu";
    
    private final List<String> drinks;
    
    public DrinksMenu() {
        drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Lager");
        drinks.add("Wine");
        drinks.add("IPA");
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
        
        System.out.println("Drinks available:");
        
        for(String item : drinks) {
            System.out.println(item);
        }
        
        System.out.println();
    }
    
    @Override
    public boolean itemAvailable(String item) {
        
        if(item == null) return false;
        
        return drinks.contains(item);
    }
    
}
