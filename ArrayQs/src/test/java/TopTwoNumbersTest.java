import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.arrayqs.TopTwoNumbers.*;

public class TopTwoNumbersTest {
    
    @Test
    public void given_Array_Then_returnTopTwoNumbers() {
        
        int [] array = {10, 20, 11, 50, 9};
        int [] topTwo = {50, 20};
        
        assertArrayEquals(topTwoNumbers(array), topTwo);
        
    }
    
}
