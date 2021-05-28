import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.arrayqs.SmallestMissingNumber.*;

public class SmallestMissingNumberTest {
    
    @Test
    public void given_Array_Then_returnSmallestMissingNumber() {
        
        int [] array1 = {1,2,3,5,6};
        assertEquals(findSmallestMissingNumber(array1), 4);
        
        int [] array2 = {6,-1,-2,3,1,2,5,6};
        assertEquals(findSmallestMissingNumber(array2), 4);
        
    }
    
    @Test
    public void given_ArrayOfNegativeValues_Then_returnOne() {
        
        int [] array1 = {-1,-2,-3};
        assertEquals(findSmallestMissingNumber(array1), 1);
        
    }
    
    @Test
    public void given_InOrderArray_Then_returnSmallestValueNotInArray() {
        
        int [] array1 = {1,2,3};
        assertEquals(findSmallestMissingNumber(array1), 4);
        
    }
    
}
