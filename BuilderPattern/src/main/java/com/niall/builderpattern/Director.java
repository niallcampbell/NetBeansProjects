package com.niall.builderpattern;

/**
 *  Contains common template construction routines that the client can use. 
 * 
 * @author niallcampbell
 */
public class Director {
    
    public Vehicle createRedVehicle(VehicleBuilder builder) {
        
        builder.addColour("Red");
        builder.addWheels(4);
        builder.addGears(5);
        
        return builder.getVehicle();
    }
    
    public Vehicle createBlueVehicle(VehicleBuilder builder) {
        
        builder.addColour("Blue");
        builder.addWheels(4);
        builder.addGears(6);
        
        return builder.getVehicle();
    }
    
}
