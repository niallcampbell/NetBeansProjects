package menus;

public class Client {
    
    public static void main(String [] args) {
        
        FoodMenuFactory foodMenuFactory1 = new FastFoodMenuFactory();
        Menu foodMenu1 = foodMenuFactory1.requestFoodMenu();
        
        DrinksMenuFactory drinksMenuFactory1 = new PubMenuFactory();
        Menu drinksMenu1 = drinksMenuFactory1.requestDrinksMenu();
        
        FoodMenuFactory foodMenuFactory2 = new FineDiningMenuFactory();
        Menu foodMenu2 = foodMenuFactory2.requestFoodMenu();
        
        DrinksMenuFactory drinksMenuFactory2 = new NightclubMenuFactory();
        Menu drinksMenu2 = drinksMenuFactory2.requestDrinksMenu();
        
    }
    
}
