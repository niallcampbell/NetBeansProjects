package menus;

public abstract class FoodMenuFactory {
    
    public Menu requestFoodMenu() {
        
        Menu menu = createMenu();
        System.out.println("Restaurant Name: " + menu.getEstablishmentName());
        System.out.println("Restaurant Type: " + menu.getEstablishmentType());
        System.out.println("Menu Type: " + menu.getMenuType());
        System.out.println();
        return menu;
        
    }
    
    public abstract Menu createMenu();
    
}
