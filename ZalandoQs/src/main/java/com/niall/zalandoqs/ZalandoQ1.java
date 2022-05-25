package com.niall.zalandoqs;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author niallcampbell
 */
public class ZalandoQ1 {
    
    private static final String NO_CONTACT = "NO CONTACT";
    
    public static String solution(String[] A, String[] B, String P) {
        
        if(A == null || B == null || P == null) return NO_CONTACT;
        
        // create an ArrayList to add names of matching numbers
        
        // loop through B and check if the string contains P
        
        // if it does add it to the ArrayList
        
        // Sort the ArrayList and return the first element
        
        // otherwise return no contact
        
        List<String> matchingPeople = new ArrayList<>();
        
        for(int i = 0; i < B.length; i++) {
            if(B[i].contains(P)) {
                matchingPeople.add(A[i]);
            }
        }
        
        if(matchingPeople.isEmpty()) return NO_CONTACT;
        
        Collections.sort(matchingPeople);
        
        return matchingPeople.get(0);
    }
    
}
