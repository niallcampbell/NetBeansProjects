package com.niall.stringqs;

import java.util.HashMap;
import java.util.Map;

/**
 *  A number in Roman Numerals is a string of symbols written in descending order. 
 * 
 *  However, in a few specific cases, to avoid four characters being repeated in succession(such as IIII or XXXX), 
 *      subtractive notation is often used as follows: 
 * 
 *      I placed before V or X indicates one less, so four is IV (one less than 5) and 9 is IX (one less than 10)
 * 
 *      X placed before L or C indicates ten less, so forty is XL (10 less than 50) and 90 is XC (ten less than a hundred).
 * 
 *      C placed before D or M indicates a hundred less, so four hundred is CD (a hundred less than five hundred) and nine hundred is CM (a hundred less than a thousand).
 * 
 *  
 *  Algorithm:
 * 
 *      Take each symbol:
 * 
 *          1. If current value of symbol is greater than or equal to the value of next symbol, then add this value to the running total.
 *          
 *          2. else subtract this value from the next value and then add the result to the running total.
 * 
 */
public class RomanNumerals {
    
    static final Map<Character, Integer> romanNumerals  = new HashMap<>();
    
    static {
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
    }
    
    /**
     *  Given a string that represents a valid Roman Numeral, return the equivalent integer value.
     *  @param String roman numeral 
     *  @return int integer equivalent
     */
    public static int getIntegerValueOfRomanNumeral(String rn) {
        
        char[] numerals = rn.toCharArray();
        
        int total = 0;
        
        for(int i = 0; i < numerals.length; i++) {
            
            if((i != numerals.length -1) && (romanNumerals.get(numerals[i]) < romanNumerals.get(numerals[i+1]))) {
                total += (romanNumerals.get(numerals[i+1]) - romanNumerals.get(numerals[i]));
                i++;
            } else {
                total += romanNumerals.get(numerals[i]);
            }  
        }
        
        return total;
    }
    
}
