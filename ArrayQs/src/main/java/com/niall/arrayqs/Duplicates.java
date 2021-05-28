package com.niall.arrayqs;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;

public class Duplicates {
    
    public static int[] removeDuplicateValues(int[] array) {
    
        HashSet<Integer> noDuplicatesSet = new HashSet<>();
        
        for(int i = 0; i < array.length; i++) {
            noDuplicatesSet.add(array[i]);
        }
        
        if(noDuplicatesSet.isEmpty()) return null;
        
        int[] noDuplicatesArray = new int[noDuplicatesSet.size()];
        int i = 0;
        
        for(int value : noDuplicatesSet) {
            noDuplicatesArray[i] = value;
            i++;
        }
        
        Arrays.sort(noDuplicatesArray);
        
        return noDuplicatesArray;
    }
    
    
    public static int[] findDuplicateValues(final int [] array) {
    
        final HashMap<Integer, Integer> occurrencesOfNums = new HashMap<>();
        final ArrayList<Integer> noDuplicatesList = new ArrayList<>();
        
        for(int i = 0; i < array.length; i++) {
            if(occurrencesOfNums.containsKey(array[i])) {
                occurrencesOfNums.put(array[i], occurrencesOfNums.get(array[i]) + 1);
            } else {
                occurrencesOfNums.put(array[i], 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : occurrencesOfNums.entrySet()) {
            if(entry.getValue() > 1) noDuplicatesList.add(entry.getKey());
        }
        
        if(noDuplicatesList.isEmpty()) return null;
        
        final int[] noDuplicatesArray = new int[noDuplicatesList.size()];
        
        int i = 0;
        for(int item : noDuplicatesList) {
            noDuplicatesArray[i] = item;
            i++;
        }
        
        Arrays.sort(noDuplicatesArray);
        
        return noDuplicatesArray;
    }
    
}
