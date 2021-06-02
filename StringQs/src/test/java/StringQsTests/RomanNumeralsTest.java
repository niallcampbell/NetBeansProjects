package StringQsTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.stringqs.RomanNumerals.*;

public class RomanNumeralsTest {
    
    @Test
    public void given_RomanNumeral_Return_DecimalValue() {
        
        assertEquals(getIntegerValueOfRomanNumeral("IV"), 4);
        assertEquals(getIntegerValueOfRomanNumeral("M"), 1000);
        assertEquals(getIntegerValueOfRomanNumeral("XIII"), 13);
        assertEquals(getIntegerValueOfRomanNumeral("CXLIV"), 144);
        assertEquals(getIntegerValueOfRomanNumeral("MCDXII"), 1412);
        
    }
    
}
