package com.niall.binarygap;

import java.util.ArrayList;

public class BinaryGap {
    
    public static int findLargestBinaryGap(final int N) {
    
        if(N < 0) return 0;
        
        final String b = convertIntToBinary(N);
        final char[] binaryValues = b.toCharArray();
        final int length = binaryValues.length;
        
        final ArrayList<Integer> listOfBinaryGaps = new ArrayList<>();
        
        int count = 0;
        
        for(int i = 1; i < length; i++) {
            if(binaryValues[i] == '1') {
                listOfBinaryGaps.add(count);
                count = 0;
            } else count++;
        }
        
        return getLargestValueInList(listOfBinaryGaps);
    }
    
    
    public static String convertIntToBinary(int value) {
        
        String binaryValue = new String();
    
        while(value > 0) {
        
            int remainder = value % 2;
            binaryValue = remainder + binaryValue;
            value /= 2;  
        }
    
        return binaryValue;
    }
    
    
    public static int getLargestValueInList(final ArrayList<Integer> list) {
    
        if(list == null) return 0;
        
        Integer largest = 0;
        
        for(int i = 0; i < list.size(); i++) {
            largest = (list.get(i) > largest) ? list.get(i) : largest;
        }
    
        return largest;
    }
    
}
