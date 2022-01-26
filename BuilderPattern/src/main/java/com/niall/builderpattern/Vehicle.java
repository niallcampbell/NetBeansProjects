package com.niall.builderpattern;

public interface Vehicle {
    
    public abstract void setWheels(int numWheels);
    public abstract void setDoors(int numDoors);
    public abstract void setGears(int numGears);
    public abstract void setColour(String colour);
    public abstract void setEngineType(String engineType);
    
}
