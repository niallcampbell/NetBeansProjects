package com.niall.factorymethodproject;

public class Client {
    
    Laptop l;
    
    public void useLaptop(LaptopFactory laptopFactory) {
        l = laptopFactory.buildLaptop();
        System.out.println("Client is using laptop.");
    }
    
}
