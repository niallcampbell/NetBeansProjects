package com.niall.numbers;

/**
 *  Prime Number Questions
 *  
 * @author niallcampbell
 */
public class Prime {
    
    public static boolean isPrimeNumber(int value) {
        
        if(value == 1) return true;
        
        for(int i = 2; i <= value - 1; i++) {
            if(value % i == 0) return false;
        }
        
        return true;
    }
    
}
