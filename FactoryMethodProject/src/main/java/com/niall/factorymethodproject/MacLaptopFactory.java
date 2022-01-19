package com.niall.factorymethodproject;

public class MacLaptopFactory extends LaptopFactory {
    
    public Laptop createLaptop() {
        return new MacLaptop();
    }
    
}
