package com.niall.stringqs;

/**
 *
 * @author niallcampbell
 */
public class Reverse {
    
    public static String reverseString(String s) {
    
        char[] chars = s.toCharArray();
        
        int i = 0, j = chars.length - 1;
        
        char temp;
        
        while(i < j) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++; 
            j--;
        }
        
        return String.valueOf(chars);
    }
    
    
    public static String reverseSentence(String sentence) {
        
        String[] words = sentence.split(" ");
        
        int i = 0, j = words.length -1;
        
        String temp;
        
        while(i < j) {
            temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        
        String reversedSentence = "";
        
        for(String word : words) {
            reversedSentence = reversedSentence + " " + word;
        }
        
        return reversedSentence.trim();
        
    }
    
    /**
     *  Reverse words in a string but keep the punctuation marks in the same order.
     * 
     *  "Hello, world!" should return "world, Hello!"
     * 
     * @param String sentence
     * @return String
     * 
     */
    public static String reverseSentenceKeepPunctuation(String sentence) {
        
        String[] words = sentence.split(" ");
        
        int i = 0, j = words.length - 1;
        
        while(i < j) {
            swapWordsWithPunctuation(words, i, j);
            i++;
            j--;
        }
        
        String reversedSentence = "";
        
        for(String word : words) {
            reversedSentence = reversedSentence + " " + word;
        }
        
        return reversedSentence.trim();
        
    }
    
    private static void swapWordsWithPunctuation(String[] array, int i, int j) {
        
        String temp1 = array[i];
        String temp2 = array[j];
        
        boolean b1 = false, b2 = false;
        
        char p1 = ' ', p2 = ' ';
        
        String punctuations = ".,!?";
        
        if(punctuations.contains(Character.toString(temp1.charAt(temp1.length() -1)))) {
            b1 = true;
            p1 = temp1.charAt(temp1.length() -1);
            temp1 = temp1.substring(0, temp1.length() - 1);
        }
        
        if(punctuations.contains(Character.toString(temp2.charAt(temp2.length() -1)))) {
            b2 = true;
            p2 = temp2.charAt(temp2.length() -1);
            temp2 = temp2.substring(0, temp2.length() - 1);
        }
        
        if(b1) temp2 += p1;
        if(b2) temp1 += p2;
        
        array[j] = temp1;
        array[i] = temp2;
        
    }
    
}
