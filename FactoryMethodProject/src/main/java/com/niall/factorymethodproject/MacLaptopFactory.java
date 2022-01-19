package com.niall.factorymethodproject;

public class MacLaptopFactory implements LaptopFactory {
    
    public Laptop buildLaptop() {
        System.out.println("Building laptop.");
        return new MacLaptop();
    }
    
}
