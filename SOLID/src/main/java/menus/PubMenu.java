package menus;

public class PubMenu extends DrinksMenu {
    
    private final String pubName;
    private static final String ESTABLISHMENT_TYPE = "Pub";
    
    public PubMenu(final String pubName) {
        this.pubName = pubName;
    }
    
    @Override
    public String getEstablishmentName() {
        return pubName;
    }
    
    public String getEstablishmentType() {
        return ESTABLISHMENT_TYPE;
    }
    
}
