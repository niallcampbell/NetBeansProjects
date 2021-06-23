package menus;

public class FastFoodMenu extends FoodMenu {
    
    private final String restaurantName;
    private static final String ESTABLISHMENT_TYPE = "Fast Food";
    
    public FastFoodMenu(final String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    @Override
    public String getEstablishmentName() {
        return restaurantName;
    }
    
    public String getEstablishmentType() {
        return ESTABLISHMENT_TYPE;
    }
    
}
