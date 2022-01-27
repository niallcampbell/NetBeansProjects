package json_html_tests;

import com.niall.jsonhtmlproject.HTTPPractice;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author niallcampbell
 */
public class HTMLTests {
    
    static HTTPPractice httpPracticeObj;
    static HttpRequest getRequest;
    static HttpRequest postRequest;
    
    @BeforeAll
    public static void init() {
        
        httpPracticeObj = new HTTPPractice();
        
        getRequest = HttpRequest.newBuilder().GET()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .setHeader("User-Agent", "Example request")
                .build();
        
    }
    
    @Test
    public void GIVEN_getRequestOnAPIEndpoint_THEN_statusCodeEquals200() {
        
        try {
            HttpResponse<String> response = httpPracticeObj.sendGet(getRequest);
            assertEquals(response.statusCode(), 200);
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }
    
    @Test
    public void GIVEN_postRequestToAPIEndpoint_THEN_statusCodeEquals200() {
        
        try {
            
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
            
            HttpResponse<String> response = httpPracticeObj.postJSON(postRequest);
            
            assertEquals(response.statusCode(), 200);
            
        } catch (Exception e) {
            System.out.println(e);
        } 
        
    }
    
}
