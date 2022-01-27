package com.niall.jsonhtmlproject;

import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;

import org.json.JSONObject;

/**
 *
 * @author niallcampbell
 */
public class HTTPPractice {
    
    private final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1).build();
    
    /**
     *  Synchronous GET request
     * 
     *  APIs to use:
     *  https://httpbin.org/get
     *  https://jsonplaceholder.typicode.com/posts/1
     * 
     * 
     * @throws Exception 
     */
    public HttpResponse<String> sendGet(HttpRequest request) throws Exception {
        
        System.out.println("GET request");
        
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        
        System.out.println("Status Code: " + response.statusCode());
        
        System.out.println("Response headers: ");
        HttpHeaders headers = response.headers();
        headers.map().forEach((k, v) -> System.out.println(k + ":" + v));
        
        String body = response.body();
        JSONObject bodyJSON = new JSONObject(body);
        System.out.println("JSON returned in body: " + bodyJSON);
        
        return response;
        
    }
    
    /**
     *  POST request
     * 
     * @param request
     * @return
     * @throws Exception 
     */
    public HttpResponse<String> postJSON(HttpRequest request) throws Exception {
        
        System.out.println("POST request");
        
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        
        System.out.println("Status Code: " + response.statusCode());
        
        System.out.println("Response headers: ");
        HttpHeaders headers = response.headers();
        headers.map().forEach((k, v) -> System.out.println(k + ":" + v));
        
        String body = response.body();
        JSONObject bodyJSON = new JSONObject(body);
        System.out.println("JSON returned in body: " + bodyJSON);
        
        return response;
    }
    
    
    public static void main(String [] args) throws Exception {
        
        HTTPPractice httpPracticeObj = new HTTPPractice();
        
        HttpRequest getRequest = HttpRequest.newBuilder().GET()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .setHeader("User-Agent", "Example request")
                .build();
        
        httpPracticeObj.sendGet(getRequest);
        
        System.out.println();
        
        JSONObject json = new JSONObject();
        json.put("Name", "John");
        json.put("Age", 27);
        String requestJSON = json.toString();
        
        HttpRequest postRequest = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestJSON))
                .uri(URI.create("https://httpbin.org/post"))
                .setHeader("User-Agent", "Local POST Request")
                .header("Content-Type", "application/json")
                .build();
        
        httpPracticeObj.postJSON(postRequest);
        
    }
    
}
