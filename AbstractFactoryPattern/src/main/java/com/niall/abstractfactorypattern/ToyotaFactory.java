package com.niall.abstractfactorypattern;

public class ToyotaFactory implements AbstractFactory {
    
    public Car getCar() {
        return new ToyotaCar();
    }
    
    public Truck getTruck() {
        return new ToyotaTruck();
    }
    
}
