package com.niall.builderpattern;

public class Car implements Vehicle {
    
    private int numWheels;
    private int numDoors;
    private int numGears;
    private String engineType;
    private String colour;
    
    @Override
    public void setWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    
    @Override
    public void setDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    
    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    @Override
    public void setGears(int numGears) {
        this.numGears = numGears;
    }
    
    @Override
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
}
