package URLShortenerTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.urlshortener.URLShortener.*;

public class URLShortenerTests {
    
    @Test
    public void GIVEN_uniqueID_THEN_returnShortURLString() {
        
        assertEquals(convertIDToShortURL(12345), "dnh");
        assertEquals(convertIDToShortURL(125), "cb");
        
    }
    
}
