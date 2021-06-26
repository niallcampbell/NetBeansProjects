import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.arrayqs.SecondLargestElement.*;

public class SecondLargestElementTest {
    
    @Test
    public void given_Array_return_SecondLargestElement() {
        
        int[] array1 = {3,6,5,6,8,1,9};
        assertEquals(findSecondLargestElement(array1), 8);
        
        int[] array2 = {6,3};
        assertEquals(findSecondLargestElement(array2), 3);
        
        int[] array3 = {3,6,8,6,8,6,8};
        assertEquals(findSecondLargestElement(array3), 6);
        
    }
    
    @Test
    public void given_Array_return_SecondLargestElement_using_AltMethod() {
        
        int[] array1 = {3,6,5,6,8,1,9};
        assertEquals(findSecondLargestElementAlt(array1), 8);
        
        int[] array2 = {6,3};
        assertEquals(findSecondLargestElementAlt(array2), 3);
        
        int[] array3 = {3,6,8,6,8,6,8};
        assertEquals(findSecondLargestElementAlt(array3), 6);
        
    }
    
}
