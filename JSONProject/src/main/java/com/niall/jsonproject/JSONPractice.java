package com.niall.jsonproject;

import org.json.JSONObject;
import org.json.JSONArray;

public class JSONPractice {
    
    public static void main(String [] args) {
        
        JSONObject jo = new JSONObject();
        jo.put("Name", "John Doe");
        jo.put("Age", 27);
        
        JSONArray cities = new JSONArray();
        cities.put("Paris");
        cities.put("London");
        cities.put("New York");
        jo.put("Cities", cities);
        
        System.out.println(jo);
        
    }
    
}
