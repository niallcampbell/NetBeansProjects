package com.niall.factorymethodproject;

public class Driver {
    
    public static void main(String [] args) {
        
        LaptopFactory laptopFactory;
        
        String osName = System.getProperty("os.name").toLowerCase();
        
        if(osName.contains("mac")) {
            laptopFactory = new MacLaptopFactory();
        } else {
            laptopFactory = new WindowsLaptopFactory();
        }
        
        Client client = new Client();
        client.useLaptop(laptopFactory);
        
    }
    
}
