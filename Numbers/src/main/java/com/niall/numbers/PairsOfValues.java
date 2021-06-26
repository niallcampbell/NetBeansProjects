package com.niall.numbers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



/**
 *  Given an array of values, print the pairs that sum to a given value.
 * 
 *  @author niallcampbell
 */
public class PairsOfValues {
    
    /**
     *  Performance is O(n). 
     * 
     *  If there is a corresponding pair value in the set, print them.
     *  Else add this value should there be a matching pair value later for it. 
     * 
     * @param array
     * @param sum 
     */
    public static void printPairsOfValuesAlt(int[] array, int sum) {
        
        Set<Integer> values = new HashSet<>();
        
        for(int item : array) {
            
            if(values.contains(sum - item)) {
                System.out.println("(" + item + ", " + (sum - item) + ")");
            } else {
                values.add(item);
            }
            
        }
    }
    
    /**
     *  Performance is O(n). 
     * 
     *  If the value is in the map, then its corresponding pair value has already been put in it.    
     * 
     * @param array
     * @param sum 
     */
    public static void printPairsOfValues(int[] array, int sum) {
        
        Map<Integer, Integer> pairs = new HashMap<>();
        
        for(int item : array) {
            
            if(pairs.containsKey(item)) {
                System.out.println("(" + item + ", " + pairs.get(item) + ")");
            } else {
                pairs.put(sum - item, item);
            }
            
        }
    }
    
    
    public static void main(String [] args) {
        
        int[] array = {1, 5, 7, -1, 8, 1};
        
        printPairsOfValues(array, 6);
        
        printPairsOfValuesAlt(array, 6);
        
    }
    
}
