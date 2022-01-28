package com.niall.sortingalgorithms;

import java.util.Random;

/**
 *
 * @author niallcampbell
 */
public class Quicksort {
    
    /**
     *  Algorithm:
     * 
     *  Choose the last element as the pivot value. 
     *  Walk from the left and find any values less than the pivot value. 
     *  Walk from the right and find any values greater than the pivot value. 
     *  When you find two values that are less & greater, swap them into place. 
     *  Keep doing this until the pointers cross. 
     *  When this happens, swap the pivot into place. 
     *  Now quicksort the two sub-arrays either side of the pivot. 
     *  Repeat this until the array is sorted. 
     * 
     * 
     * 
     * @param array
     * @param lowIndex
     * @param highIndex 
     */
    public static void quicksort(int[] array, int lowIndex, int highIndex) {
        
        // when you get to an array of just one element, we know this array is sorted
        if(lowIndex >= highIndex) return;
        
        int pivot = array[highIndex];
        
        // used to find values lower than the pivot
        int leftPointer = lowIndex;
        
        // used to find values higher than the pivot
        int rightPointer = highIndex - 1;
        
        // when the pointers cross each other this loop will break
        while(leftPointer < rightPointer) {
            
            // walk from the left until we find a number less than the pivot
            // if a value on the left of the pivot is less than the pivot, 
                // move on to the next index
            while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            
            // walk from the right until we find a number greater than the pivot
             // if a value on the right of the pivot is less than the pivot, 
                // move on to the next index
            while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            
            // when you find a value greater than the pivot on the left, 
                // and a value less than the pivot on the right
                    // swap them
            swap(array, leftPointer, rightPointer);
        }
        
        // once the two pointers meet, we want to put the pivot into its correct place
            // we know the pivot is at the high index
                // so swap it with the value at the left pointer
        if(array[leftPointer] > array[highIndex]) {
            swap(array, leftPointer, highIndex);
        } else {
            leftPointer = highIndex;
        }
        
        // now all the numbers to the left of the pivot should be lower than it (but not in order)
            // and all of the values to the right should be bigger (but again not in order)
        
        // now we recursively quicksort the two sub-arrays on either side of the pivot to sort them
        // at this point the leftPointer is at the index of the pivot
        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);
            
        
    }
    
    
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    
    public static void main(String [] args) {
        
        Random random = new Random();
        int[] numbers = new int[10];
        
        System.out.println("Unsorted: ");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println();
        
        quicksort(numbers, 0, numbers.length - 1);
        
        System.out.println("Sorted: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
    }
    
}
