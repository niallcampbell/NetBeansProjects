package com.niall.abstractfactorypattern;

public class Client {
    
    private AbstractFactory factory;
    
    public Client(AbstractFactory factory) {
        this.factory = factory;
    }
    
    public void buyCar() {
        System.out.println("Buying car");
        Car car = factory.getCar();
        car.printCarType();
    }
    
    public void buyTruck() {
        System.out.println("Buying truck");
        Truck truck = factory.getTruck();
        truck.printTruckType();
    }
    
}
