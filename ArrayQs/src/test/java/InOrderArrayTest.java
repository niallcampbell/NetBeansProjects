import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.arrayqs.InOrderArray.*;

public class InOrderArrayTest {
    
    @Test
    public void given_Array_RemoveElementsAndCheckIfInOrder() {
        
        int[] array = {1,2,4,3,5};
        assertEquals(inOrderArray(array), 2);
        
    }

    
}
