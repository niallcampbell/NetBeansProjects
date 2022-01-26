package com.niall.builderpattern;

public class CarBuilder implements VehicleBuilder {
    
    private Car car = new Car();
    
    @Override
    public void addWheels(int numWheels) {
        car.setWheels(numWheels);
    }
    
    @Override
    public void addDoors(int numDoors) {
        car.setDoors(numDoors);
    }
    
    @Override
    public void addGears(int numGears) {
        car.setGears(numGears);
    }
    
    @Override
    public void addColour(String colour) {
        car.setColour(colour);
    }
    
    @Override
    public void addEngineType(String engineType) {
        car.setEngineType(engineType);
    }
    
    @Override
    public Vehicle getVehicle() {
        return car;
    }
    
}
