package StringQsTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.stringqs.Palindrome.*;

public class PalindromeTests {
    
    @Test
    public void given_StringContainingPalindrome_return_True() {
        assertTrue(containsPalindrome("otto"));
    }
    
    @Test
    public void given_StringNotContainingPalindrome_return_False() {
        assertFalse(containsPalindrome("niall"));
    }
    
    @Test
    public void given_Palindrome_Return_True() {
        assertTrue(isPalindrome("otto"));
    }
    
    @Test
    public void given_NotPalindrome_Return_False() {
        assertFalse(isPalindrome("niall"));
    }
    
}
