package com.niall.factorymethodproject;

public interface Laptop {
    
    public abstract void getOSDetails();
    
    public default void turnOnLaptop() {
        System.out.println("Turning on laptop.");
    }
    
}
