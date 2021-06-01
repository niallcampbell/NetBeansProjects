package StringQsTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.stringqs.Palindrome.*;

public class PalindromeTests {
    
    @Test
    public void given_Palindrome_return_True() {
        assertTrue(isPalindrome("otto"));
    }
    
    @Test
    public void given_notPalindrome_return_False() {
        assertFalse(isPalindrome("niall"));
    }
    
}
