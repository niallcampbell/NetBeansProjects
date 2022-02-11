package com.niall.hubspotpractice;

import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import org.json.JSONObject;

/**
 * HTTP Router class for performing CRUD commands to API endpoints. 
 *
 * @author niallcampbell
 */
public class HTTPRouter {
    
    private final static HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1).build();
    
    
    /**
     * Perform a HTTP GET request to a specified endpoint. 
     * 
     * @param url
     * @return HttpResponse<String> response
     */
    public HttpResponse<String> sendGETRequest(final String url) {
        
        final HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create(url))
                .setHeader("User-Agent", "Example request")
                .build();
        
        HttpResponse<String> response = null;
        
        try {
            System.out.println("Sending HTTP GET request.");
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch(Exception e) {
            System.out.println("Unable to perform HTTP GET request successfully: " + e);
        }
        
        return response;
    }
    
    
    /**
     * Perform a HTTP POST request to a specified endpoint with the provided JSON. 
     * 
     * @param url
     * @param json
     * @return HttpResponse<String> response
     */
    public HttpResponse<String> sendPOSTRequest(final String url, final JSONObject json) {
        
        final String requestJSON = json.toString();
        
        final HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestJSON))
                .uri(URI.create(url))
                .setHeader("User-Agent", "Local POST Request")
                .header("Content-Type", "application/json")
                .build();
        
        HttpResponse<String> response = null;
        
        try {
            System.out.println("Sending HTTP POST request.");
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch(Exception e) {
            System.out.println("Unable to perform HTTP POST request successfully: " + e);
        }
        
        return response;
    }
    
    
    /**
     * Print details of a HTTP response. 
     *  
     * @param response 
     */
    public void printHTTPResponseInfo(final HttpResponse<String> response) {
        
        System.out.println("Status Code: " + response.statusCode());
        
        System.out.println("Response headers:");
        final HttpHeaders headers = response.headers();
        headers.map().forEach((k, v) -> System.out.println(k + ":" + v));
        
        final String body = response.body();
        final JSONObject bodyJSON = new JSONObject(body);
        System.out.println("JSON returned in body: " + bodyJSON);
    }
    
    
    /**
     * Get the JSON from the body of a HTTP response. 
     * 
     * @param response
     * @return JSONObject
     */
    public JSONObject getJSONFromHTTPReponseBody(final HttpResponse<String> response) {
        
        final String body = response.body();
        final JSONObject bodyJSON = new JSONObject(body);
        return bodyJSON;
    }
    
}
