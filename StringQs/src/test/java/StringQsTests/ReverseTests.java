package StringQsTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.stringqs.Reverse.*;

public class ReverseTests {
    
    @Test
    public void given_String_return_StringReversed() {
        
        assertEquals(reverseString("Hello"), "olleH");
        
    }
    
    @Test
    public void given_Sentence_return_SentenceReversed() {
        
        assertEquals(reverseSentence("Hello World and Niall"), "Niall and World Hello");
        
    }
    
    @Test
    public void given_Sentence_resverseWithPunctuationInPlace() {
        
        assertEquals(reverseSentenceKeepPunctuation("Hello, World! and Niall?"), "Niall, and! World Hello?");
        
        assertEquals(reverseSentenceKeepPunctuation("Hello, World!"), "World, Hello!");
        
        assertEquals(reverseSentenceKeepPunctuation("Hello! World? and Niall"), "Niall! and? World Hello");
    }
    
}
