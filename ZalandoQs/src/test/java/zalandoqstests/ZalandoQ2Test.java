package zalandoqstests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.zalandoqs.ZalandoQ2.solution;

public class ZalandoQ2Test {
    
    @Test
    public void GIVEN_value_THEN_returnNumOfOnesInBinaryVersion() {
        assertEquals(3, solution(3, 7));
    }
    
}
