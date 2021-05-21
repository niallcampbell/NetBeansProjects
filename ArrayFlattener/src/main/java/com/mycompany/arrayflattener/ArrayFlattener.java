package com.mycompany.arrayflattener;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayFlattener {
    
    /**
     *  Takes an n-dimensional array of type Integer and flattens it into a 1-dimensional array.
     *  @param Object array containing an n-dimensional Integer array. 
     *  @return Integer array
     */
    public static Integer[] flattenArray(Object [] inputArray) {
        
        if(inputArray == null) return null;
        
        ArrayList<Integer> flattenedArray = new ArrayList<>();
        
        for(Object element : inputArray) {
            if(element instanceof Integer) {
                flattenedArray.add((Integer) element);
            } else if(element instanceof Object[]) {
                flattenedArray.addAll(Arrays.asList(flattenArray((Object[]) element)));
            } else {
                throw new IllegalArgumentException("Invalid argument - must be an Integer or an array of Integers.");
            }
        }
        
        return flattenedArray.toArray(new Integer[flattenedArray.size()]);
        
    }
    
    public static void main(String [] args) {
    
        Integer [][] array = {{1,2}, {3,4}};
        Integer [] arrayFlattened  = flattenArray(array);
        
        System.out.println("Flattened Array: ");
        
        for(Integer i : arrayFlattened) {
            System.out.print(i + " ");
        }
        
        Integer [][][] array2 = {{{5,6}, {7,8}}, {{9, 10}, {11, 12}}};
        Integer [] arrayFlattened2  = flattenArray(array2);
        
        System.out.println();
        System.out.println("Flattened Array: ");
        
        for(Integer i : arrayFlattened2) {
            System.out.print(i + " ");
        }
        
    }
    
}
