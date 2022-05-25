package zalandoqstests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.zalandoqs.ZalandoQ1.solution;

public class ZalandoQ1Test {
    
    @Test
    public void GIVEN_PartialPhoneNumber_RETURN_MatchingName() {
        String[] A = {"pim", "pom"};
        String[] B = {"999999999", "777888999"};
        String P = "88999";
        
        assertEquals("pom", solution(A, B, P));
    }
    
    @Test
    public void GIVEN_PartialPhoneNumber_RETURN_SmallestMatchingName() {
        String[] A = {"sander", "amy", "ann", "michael"};
        String[] B = {"723456789", "234567890", "789123456", "123123123"};
        String P = "1";
        
        assertEquals("ann", solution(A, B, P));
    }
    
    @Test
    public void GIVEN_PartialPhoneNumberWithNoMatch_RETURN_NoContact() {
        String[] A = {"adam", "eva", "leo"};
        String[] B = {"121212121", "111111111", "444555666"};
        String P = "112";
        
        assertEquals("NO CONTACT", solution(A, B, P));
    }
    
}
