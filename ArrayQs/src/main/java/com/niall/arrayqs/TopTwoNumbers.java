package com.niall.arrayqs;

public class TopTwoNumbers {
    
    /**
     * 
     * Find the top two maximum numbers in the given array without using a sorting algorithm. 
     * 
     * @param int array
     * @return int array
     */
    public static int[] topTwoNumbers(final int[] array) {
        
        int topValue = -1;
        int secondTopValue = -1;
        
        for(int item : array) {
            if(item > topValue) {
                secondTopValue = topValue;
                topValue = item;
            } else if (item > secondTopValue) {
                secondTopValue = item;
            }
        }
        
        return new int[]{topValue, secondTopValue};
    }
    
}
