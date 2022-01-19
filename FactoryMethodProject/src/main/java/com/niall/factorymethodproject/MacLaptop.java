package com.niall.factorymethodproject;

public class MacLaptop implements Laptop {
    
    private final String osType = "MacOS"; 
    
    public void getOSDetails() {
        System.out.println("OS Type is: " + osType);
    }
    
}
