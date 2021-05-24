package com.mycompany.hashmappractice;

import java.util.Map;
import java.util.HashMap;

public class HashMapPractice {
    
    public static void main(String ... args) {
    
        HashMap<String, Integer> numberOfItems = new HashMap<>();
        
        numberOfItems.put("Shirt", 3);
        numberOfItems.put("Jeans", 5);
        numberOfItems.put("Jumper", 7);
        numberOfItems.put("T-shirt", 4);
        
        int size = numberOfItems.size();
        
        System.out.println("There are " + size + " different items in stock: ");
        
        for(String item : numberOfItems.keySet()) {
            System.out.println(item);
        }
        
        int totalQuantity = 0;
        
        for(Integer i : numberOfItems.values()) {
            totalQuantity += i;
        }
        
        System.out.println();
        System.out.println("There is a total of " + totalQuantity + " items in stock. ");
        
        System.out.println();
        
        for(Map.Entry<String, Integer> item : numberOfItems.entrySet()) {
        
            String itemDesc = item.getKey();
            int quantity = item.getValue();
            
            System.out.println("Item Description: " + itemDesc + ", Quantity: " + quantity);
            
        }
        
    }
    
}
