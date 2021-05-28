package com.niall.arrayqs;

import java.util.ArrayList;
import java.util.List;

/**
 *  Given an array, see how many times you can make the array be in order by removing one element. 
 * 
 */
public class InOrderArray {
    
    public static int inOrderArray(final int[] array) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int item : array) list.add(item);
        
        int count = 0;
        
        for(int i = 0; i < list.size(); i++) {
            int value = list.remove(i);
            if(inOrder(list)) count++;
            list.add(i, value);
        }
        
        return count;
    }
    
    private static boolean inOrder(List<Integer> list) {
        
        int length = list.size();
        
        for(int i = 0; i < length - 1; i++) {
            if(list.get(i) > list.get(i+1)) return false;
        }
        
        return true;
    }
    
}
