package com.niall.arrayqs;

import java.util.Arrays;

public class SmallestMissingNumber {
    
    /**
     *  returns the smallest positive integer N (greater than 0) that does not occur in Array.
     *  N is an integer within the range [1..100,000];
     *  each element of array A is an integer within the range [−1,000,000..1,000,000].
     * 
     */
    public static int findSmallestMissingNumber(final int[] array) {
        
        boolean isOnePresent = false;
        for(int item : array) {
            if(item == 1) isOnePresent = true;
        }
        
        if(!isOnePresent) return 1;
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length - 1; i++) {
            
            if(array[i] <= 0) continue;
            
            if(array[i+1] - array[i] != 1) {
                return array[i] + 1;
            } 
        }
        
        return array[array.length-1] + 1;
    }
    
}