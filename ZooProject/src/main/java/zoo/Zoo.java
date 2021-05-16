package zoo;

import animals.*;

import java.util.ArrayList;

public class Zoo {
    
    static ArrayList<Animal> zooAnimals = new ArrayList<Animal>();
    
    public static void main(String ... args) {
    
        zooAnimals.add(new Lion(8));
        zooAnimals.add(new Gorilla(12));
        
        for(Animal a : zooAnimals) {
            a.printDetails();
        }
    }
}
