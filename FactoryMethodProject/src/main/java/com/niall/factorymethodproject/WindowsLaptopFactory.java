package com.niall.factorymethodproject;

public class WindowsLaptopFactory extends LaptopFactory {
    
    public Laptop createLaptop() {
        return new WindowsLaptop();
    }
}
