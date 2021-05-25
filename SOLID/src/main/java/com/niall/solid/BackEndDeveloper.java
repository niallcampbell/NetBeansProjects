package com.niall.solid;

/**
 *  Low-level module. 
 * 
 */
public class BackEndDeveloper implements Developer {
    
    private String jobTitle = "Backend";
    
    public void develop() {
        createJava();
    }
    
    public void printJobDetails() {
        System.out.println(AREA + " specialising in " + jobTitle);
    }
    
    private void createJava() {
        System.out.println("Developing Java Code.");
    }
}
