package menus;

public interface Menu {
    
    public static final String ESTABLISHMENT_NAME = "Vesuvios";
    
    public abstract String getEstablishmentName();
    public abstract String getMenuType();
    public abstract void printMenuItems();
    public abstract boolean itemAvailable(String item);
    
}