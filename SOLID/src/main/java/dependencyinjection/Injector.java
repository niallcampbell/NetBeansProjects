package dependencyinjection;

public class Injector {
    
    public static void main(String [] args) {
        
        Doors redDoors = new RedDoors();
        
        Car car1 = new Car(redDoors);
        car1.printCarDetails();
        
        Doors blueDoors = new BlueDoors();
        car1.setDoors(blueDoors);
        car1.printCarDetails();
        
    }
    
}
