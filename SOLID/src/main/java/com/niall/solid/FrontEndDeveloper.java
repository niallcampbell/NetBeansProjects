package com.niall.solid;

/**
 *  Low-level module. 
 * 
 */
public class FrontEndDeveloper implements Developer {
    
    private String jobTitle = "Frontend";
    
    public void develop() {
        createCSS();
    }
    
    public void printJobDetails() {
        System.out.println(AREA + " specialising in " + jobTitle);
    }
    
    private void createCSS() {
        System.out.println("Developing CSS Code.");
    }
    
}
