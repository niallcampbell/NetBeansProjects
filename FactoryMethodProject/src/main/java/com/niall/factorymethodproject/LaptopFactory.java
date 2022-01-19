package com.niall.factorymethodproject;

public abstract class LaptopFactory {
    
    public abstract Laptop createLaptop();
    
    public Laptop buildLaptop() {
        System.out.println("Building laptop.");
        Laptop l = createLaptop();
        l.turnOnLaptop();
        l.getOSDetails();
        return l;
    }
    
}
