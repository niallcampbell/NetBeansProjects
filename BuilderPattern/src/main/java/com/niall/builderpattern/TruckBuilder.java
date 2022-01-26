package com.niall.builderpattern;

public class TruckBuilder implements VehicleBuilder {
    
    private Truck truck = new Truck();
    
    @Override
    public void addWheels(int numWheels) {
        truck.setWheels(numWheels);
    }
    
    @Override
    public void addDoors(int numDoors) {
        truck.setDoors(numDoors);
    }
    
    @Override
    public void addGears(int numGears) {
        truck.setGears(numGears);
    }
    
    @Override
    public void addColour(String colour) {
        truck.setColour(colour);
    }
    
    @Override
    public void addEngineType(String engineType) {
        truck.setEngineType(engineType);
    }
    
    @Override
    public Vehicle getVehicle() {
        return truck;
    }
    
}
