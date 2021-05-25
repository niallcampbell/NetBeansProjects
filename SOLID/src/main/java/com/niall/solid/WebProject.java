package com.niall.solid;

import java.util.List;
import java.util.ArrayList;

/**
 *  High-level module. 
 * 
 *  Decoupled from low-level modules through Dependency Inversion principle 
 *      of SOLID. 
 * 
 */
public class WebProject {
    
    List<Developer> developers = new ArrayList<>();
    
    public WebProject(List<Developer> developers) {
        this.developers = developers;
    }
    
    public void startProject() {
        
        System.out.println("Beginning Project.");
        
        developers.forEach(d -> { 
            d.printJobDetails(); 
            d.develop();
        });
        
    }
}
