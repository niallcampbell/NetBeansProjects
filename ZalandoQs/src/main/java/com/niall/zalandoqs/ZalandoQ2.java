package com.niall.zalandoqs;

/**
 *
 * @author niallcampbell
 */
public class ZalandoQ2 {
    
    public static int solution(final int A, final int B) {
        
        final int C = A * B;
        
        String bin = Integer.toBinaryString(C);
        
        int count = 0;
        
        for(int i = 0; i < bin.length(); i++) {
            if(bin.charAt(i) == '1') count++;
        }
        
        return count;
    }
    
}
