package menus;

public abstract class DrinksMenuFactory {
    
    public Menu requestDrinksMenu() {
        
        Menu menu = createMenu();
        System.out.println("Establishment Name: " + menu.getEstablishmentName());
        System.out.println("Establishment Type: " + menu.getEstablishmentType());
        System.out.println("Menu Type: " + menu.getMenuType());
        System.out.println();
        return menu;
        
    }
    
    public abstract Menu createMenu();
    
}
