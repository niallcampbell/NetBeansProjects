package menus;

public class NightclubMenu extends DrinksMenu {
    
    private final String clubName;
    private static final String ESTABLISHMENT_TYPE = "Nightclub";
    
    public NightclubMenu(final String clubName) {
        this.clubName = clubName;
    }
    
    @Override
    public String getEstablishmentName() {
        return clubName;
    }
    
    public String getEstablishmentType() {
        return ESTABLISHMENT_TYPE;
    }
    
}
