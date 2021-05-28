package com.niall.arrayqs;

import java.util.Arrays;

public class MissingElement {
    
    /**
     * Given an array of 1...N, find the missing element
     * @return int
     */
    public static int findMissingElement(int [] array) {
        
        Arrays.sort(array);
        
        int N = array.length + 1;
        
        if(array[0] != 1) return 1;
        
        for(int i = 0; i < array.length -1; i++) {
            if(array[i+1] - array[i] != 1) {
                return array[i] + 1;
            }
        }
        
        return N;
        
        
    }
    
}
