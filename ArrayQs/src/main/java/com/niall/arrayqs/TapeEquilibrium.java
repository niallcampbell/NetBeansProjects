package com.niall.arrayqs;

import java.util.HashSet;
import java.util.Arrays;

public class TapeEquilibrium {
    
    public static int minimalDifference(final int [] array) {
        
        if(array.length < 2) return -1;
        
        // <P, difference>
        final HashSet<Integer> differences = new HashSet<>();
        
        int result = 0;
        
        for(int i = 1; i < array.length -1; i++) {
            result = calculateDifference(array, i);
            differences.add(result);
        }
        
        int lowestDifference = -1;
        for(int entry : differences) {
            if(lowestDifference == -1) lowestDifference = entry;
            else if(entry < lowestDifference) {
                lowestDifference = entry;
            }
        }
        
        return lowestDifference; 
    }
    
    private static int calculateDifference(int[] array, int P) {
        
        final int[] firstArray = Arrays.copyOfRange(array, 0, P);
        final int[] secondArray = Arrays.copyOfRange(array, P, array.length);
        
        int firstTotal = 0;
        int secondTotal = 0;
        
        for(int item : firstArray) firstTotal += item;
        
        for(int item : secondArray) secondTotal += item;
        
        if(firstTotal > secondTotal) return firstTotal - secondTotal;
        else return secondTotal - firstTotal; 
    }
    
}
