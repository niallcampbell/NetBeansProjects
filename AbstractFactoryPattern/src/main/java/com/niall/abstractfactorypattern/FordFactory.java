package com.niall.abstractfactorypattern;

public class FordFactory implements AbstractFactory {
    
    public Car getCar() {
        return new FordCar();
    }
    
    public Truck getTruck() {
        return new FordTruck();
    }
    
}
