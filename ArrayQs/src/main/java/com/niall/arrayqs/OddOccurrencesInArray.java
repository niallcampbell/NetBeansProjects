package com.niall.arrayqs;

import java.util.Arrays;

/**
 *
 * @author niallcampbell
 */
public class OddOccurrencesInArray {
    
    public static int getOddOccurance(final int [] array) {
    
        if(array.length == 0 || (array.length % 2) == 0 ) return -1;
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length - 1; i+=2) {
        
            if(array[i] != array[i+1]) return array[i];
            
        }
        
        return array[array.length - 1];
    }
    
}
