package com.niall.solid;

import java.util.List;
import java.util.ArrayList;

/**
 *  Driver class. 
 * 
 */
public class Main {
    
    public static void main(String [] args) {
    
        List<Developer> availableDevs = new ArrayList<>();
        
        BackEndDeveloper backEndDev = new BackEndDeveloper();
        availableDevs.add(backEndDev);
        
        FrontEndDeveloper frontEndDev = new FrontEndDeveloper();
        availableDevs.add(frontEndDev);
        
        WebProject project = new WebProject(availableDevs);
        
        project.startProject();
        
    }
    
}
