package com.niall.factorymethodproject;

public class WindowsLaptopFactory implements LaptopFactory {
    
    public Laptop buildLaptop() {
        System.out.println("Building laptop.");
        return new WindowsLaptop();
    }
}
