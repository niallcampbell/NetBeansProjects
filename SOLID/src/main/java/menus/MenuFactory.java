package menus;

public abstract class MenuFactory {
    
    public Menu requestMenu() {
        Menu menu = createMenu();
        System.out.println("Establishment Name: " + menu.getEstablishmentName());
        System.out.println("Establishment Type: " + menu.getMenuType());
        menu.printMenuItems();
        return menu;
    }
    
    public abstract Menu createMenu();
    
}
