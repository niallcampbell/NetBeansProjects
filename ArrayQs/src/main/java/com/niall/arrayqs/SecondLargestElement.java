package com.niall.arrayqs;

import java.util.Arrays;

/**
 *  Write a Java Program to find the second-highest number in an array. 
 * 
 *  Note array can contain duplicates. 
 * 
 *  @author niallcampbell
 */
public class SecondLargestElement {
    
    public static int findSecondLargestElement(final int[] array) {
        
        int largestValue = 0;
        int secondLargestValue = 0;
        
        Arrays.sort(array);
        
        for(int item : array) {
            if(item > largestValue) {
                secondLargestValue = largestValue;
                largestValue = item;
            } else if(item > secondLargestValue && item != largestValue) {
                secondLargestValue = item;
            }
        }
        
        return secondLargestValue;
        
    }
    
    public static int findSecondLargestElementAlt(final int[] array) {
        
        Arrays.sort(array);
        
        for(int i = array.length - 2; i >= 0; i-- ) {
            if(array[i] != array[i+1]) return array[i];
        }
        
        return -1;
    }
    
}
