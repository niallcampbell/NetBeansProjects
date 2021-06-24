package menus;

public class Client {
    
    public static void main(String [] args) {
        
        MenuFactory foodMenuFactory = new FoodMenuFactory();
        Menu foodMenu = foodMenuFactory.requestMenu();
        
        MenuFactory drinksMenuFactory = new DrinksMenuFactory();
        Menu drinksMenu = drinksMenuFactory.requestMenu();
        
    }
}