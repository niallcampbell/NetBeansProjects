package com.niall.frogjump;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FrogJumpRiver {
    
    public static int frogJumpRiver(final int X, final int[] A) {
        
        final List<Integer> leaves = new ArrayList<>();
        
        int time = -1;
        
        for(int i = 0; i < A.length -1; i++) {
            
            if(!leaves.contains(A[i])) {
                leaves.add(A[i]);
            } 
            
            if(leaves.size() < X){
                continue;
            } else if(listContainsRequiredLeaves(leaves)) {
                time = i;
            }
        }
        
        return time;
    }
    
    private static boolean listContainsRequiredLeaves(List<Integer> list) {
        
        if(!list.contains(1)) return false;
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i+1) - list.get(i) != 1) return false;
        }
        
        return true;
    }
    
}
