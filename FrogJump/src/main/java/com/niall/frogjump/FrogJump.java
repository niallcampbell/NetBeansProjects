package com.niall.frogjump;

public class FrogJump {
    
    public static int frogJump(int X, int Y, int D) {
        
        if(X < 0 || Y < 0 || D < 0) return -1;
        
        int count = 0;
        
        while(X < Y) {
            X += D;
            count++;
        }
        
        return count;
        
    }
    
    
}
