package com.niall.builderpattern;

public interface VehicleBuilder {
    
    public abstract void addWheels(int numWheels);
    public abstract void addDoors(int numDoors);
    public abstract void addGears(int numGears);
    public abstract void addColour(String colour);
    public abstract void addEngineType(String engineType);
    public abstract Vehicle getVehicle();
}
