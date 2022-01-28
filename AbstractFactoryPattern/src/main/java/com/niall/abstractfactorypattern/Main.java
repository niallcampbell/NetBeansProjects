package com.niall.abstractfactorypattern;

public class Main {
    
    public static void main(String [] args) {
        
        AbstractFactory toyotaFactory = new ToyotaFactory();
        Client client1 = new Client(toyotaFactory);
        client1.buyCar();
        client1.buyTruck();
        
        AbstractFactory fordFactory = new FordFactory();
        Client client2 = new Client(fordFactory);
        client2.buyCar();
        client2.buyTruck();
        
    }
    
}
