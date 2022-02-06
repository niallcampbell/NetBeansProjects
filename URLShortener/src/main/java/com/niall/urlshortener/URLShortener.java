package com.niall.urlshortener;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author niallcampbell
 */
public class URLShortener {
    
    // map: key = request ID, value = long url
    
    // for each original url, we will need a corresponding unique ID integer 
    // the request number will be used to create this ID for the original
    // request numbers are unique so we can create unique short url IDs from them
    
    // use base conversion to convert the ID to a short url
    // request IDs are base10, meaning there are 10 ways to represent a single number (0-9)
    // for our short url, we will use base62 as there are 62 ways to represent a single character (a-z A-Z 0-9)
    // we use base62 as it will keep the url string short even if the request number is very large, 
        // e.g. 1,000,000 converts to 4C92
    
    // convert the request ID into a base62 value
    // using a conversion chart (numbers to a-zA-Z0-9 values), create the short url
    
    // to convert the short url ID back to the long url, 
        // convert the short url values into base10
    // with this base10 key (which equals the request ID), get the long url from the map
    
    // https://medium.com/hackernoon/url-shortening-service-in-java-spring-boot-and-redis-d2a0f8848a1d
    
    // https://www.geeksforgeeks.org/how-to-design-a-tiny-url-or-url-shortener/
    
    
    
    /**
     *  Convert an integer to a short url.
     * 
     *  Algorithm:
     * 
     *  Divide the ID by 62 and store the remainder.
     * 
     *  Keep dividing the result of the previous division by 62 until you get 0.
     * 
     *  When you get 0, reverse the remainder String (i.e. go from the bottom up like when converting to binary). 
     * 
     *  For each remainder value, get its corresponding letter/digit from [a-z A-Z 0-9]
     *      e.g. 0 = a, 1 = b, ...., 26 = A, 27 = B, ...., 52 = 0, 53 = 1, ...., 61 = 9. 
     * 
     * @param id
     * @return shortURL
     */
    public static String convertIDToShortURL(int id) {
        
        char characters[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        
        ArrayList<Integer> remainders = new ArrayList<>();
        
        int r = 0;
        
        while(id > 0) {
            r = id % 62;
            id = id / 62;
            remainders.add(r);
        }
        
        Collections.reverse(remainders);
        
        StringBuilder shortURL = new StringBuilder();
        
        for(int i = 0; i < remainders.size(); i++) {
            shortURL.append(characters[remainders.get(i)]);
        }
        
        return shortURL.toString();
    }
    
}
