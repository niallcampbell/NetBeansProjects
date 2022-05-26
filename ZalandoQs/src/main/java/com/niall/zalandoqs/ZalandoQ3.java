package com.niall.zalandoqs;

/**
 *
 * @author niallcampbell
 */
public class ZalandoQ3 {
    
    public static int solution(String s) {
        
        int a = Integer.parseInt(s, 2);
        
        int count = 0;
        
        while(a > 0) {
            if(a%2 != 0) {
                a = a - 1;
                count++;
            } else {
                a = a / 2;
                count++;
            }
        }
        
        return count;
    }
    
}
