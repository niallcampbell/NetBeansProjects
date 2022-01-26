package com.niall.builderpattern;

public class Client {
    
    public static void main(String [] args) {
        
        Director director = new Director();
        
        VehicleBuilder carBuilder = new CarBuilder();
        Vehicle myRedCar = director.createRedVehicle(carBuilder);
        
        VehicleBuilder truckBuilder = new TruckBuilder();
        Vehicle myBlueTruck = director.createBlueVehicle(truckBuilder);   
        
    }
}
