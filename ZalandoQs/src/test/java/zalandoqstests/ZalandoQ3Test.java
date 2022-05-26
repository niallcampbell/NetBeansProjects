package zalandoqstests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.zalandoqs.ZalandoQ3.solution;

public class ZalandoQ3Test {
    
    @Test
    public void GIVEN_binaryString_THEN_returnNumOfOperationsPerformed() {
        
        assertEquals(7, solution("011100"));
        assertEquals(5, solution("111"));
        assertEquals(22, solution("1111010101111"));
    }
    
}
