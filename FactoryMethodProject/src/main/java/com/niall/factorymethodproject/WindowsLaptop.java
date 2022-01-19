package com.niall.factorymethodproject;

public class WindowsLaptop implements Laptop {
    
    private final String osType = "Windows";
    
    public void getOSDetails() {
        System.out.println("OS Type is: " + osType);
    }
    
}
