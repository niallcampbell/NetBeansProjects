package menus;

public class FineDiningMenu extends FoodMenu {
    
    private final String restaurantName;
    private static final String ESTABLISHMENT_TYPE = "Fine Dining Food";
    
    public FineDiningMenu(final String restaurantName) {
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
