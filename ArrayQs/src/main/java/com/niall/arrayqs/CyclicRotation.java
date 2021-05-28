package com.niall.arrayqs;

public class CyclicRotation {
    
    public static int[] performCyclicRotation(int[] array, final int K) {
    
        
        if(array.length == 0 || K < 0 || K > 100) return null;
        
        for(int i = 0; i < K; i++){
            array = shiftArrayByOne(array);
        }
    
        return array;
    }
    
    private static int[] shiftArrayByOne(int[] array) {
    
        int[] temp = new int[array.length];
        
        for(int i = 0; i < array.length -1; i++) {
            temp[i+1] = array[i];
        }
        
        temp[0] = array[array.length-1];
        
        return temp;
    }
    
}
