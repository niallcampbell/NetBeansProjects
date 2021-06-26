package numbers.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.numbers.Prime.*;

public class PrimeTests {
    
    @Test
    public void given_PrimeNumber_return_True() {
        
        assertTrue(isPrimeNumber(1));
        assertTrue(isPrimeNumber(2));
        assertTrue(isPrimeNumber(3));
        assertTrue(isPrimeNumber(11));
        
    }
    
    @Test
    public void given_NonPrimeNumber_return_False() {
        
        assertFalse(isPrimeNumber(4));
        assertFalse(isPrimeNumber(9));
        assertFalse(isPrimeNumber(21));
        assertFalse(isPrimeNumber(100));
        
    }
    
}
