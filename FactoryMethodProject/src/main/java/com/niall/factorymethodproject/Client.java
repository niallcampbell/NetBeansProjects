package com.niall.factorymethodproject;

public class Client {
    
    Laptop l;
    
    public Client(LaptopFactory laptopFactory) {
        l = laptopFactory.buildLaptop();
    }
    
    public void useLaptop() {
        System.out.println("Client is using laptop.");
        l.turnOnLaptop();
        l.getOSDetails();
    }
    
}
