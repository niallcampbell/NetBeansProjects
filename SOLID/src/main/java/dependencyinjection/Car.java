package dependencyinjection;

/**
 *  Car object implemented using Dependency Injection.  
 * 
 * @author niallcampbell
 */
public class Car {
    
    Doors doors;
    
    public Car(Doors doors) {
        this.doors = doors;
    }
    
    public void setDoors(Doors doors) {
        this.doors = doors;
    }
    
    public void printCarDetails() {
        System.out.println("Car");
        doors.printDetails();
    }
    
}
