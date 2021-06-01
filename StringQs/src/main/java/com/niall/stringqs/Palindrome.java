package com.niall.stringqs;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
      
    /**
     *  A set of characters can form a palindrome if at most one character occurs an odd number
     *       of times and all characters occur even number of times.
     * 
     *  Return true if the characters of the given string can be rearranged to form a palindrome. 
     * 
     */
    public static boolean isPalindrome(final String s) {
    
        HashMap<Character, Integer> occurrences = new HashMap<Character, Integer>();
        
        char[] characters = s.toCharArray();
        
        for(char character : characters) {
            if(occurrences.containsKey(character)) {
                occurrences.put(character, occurrences.get(character) + 1);
            } else {
                occurrences.put(character, 1);
            }
        }
        
        int oddCharCount = 0;
        
        for(Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            if(entry.getValue() % 2 != 0) oddCharCount++;
        }
        
        return (oddCharCount <= 1);
    }
    
    
}
