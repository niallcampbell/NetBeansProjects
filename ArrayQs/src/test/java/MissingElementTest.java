import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.arrayqs.MissingElement.*;


public class MissingElementTest {
    
    @Test
    public void given_Array_Then_ReturnMissingElement() {
        
        int [] array = {2, 3, 1, 5};
        assertEquals(findMissingElement(array), 4);
        
        int [] array2 = {2, 3, 4, 5};
        assertEquals(findMissingElement(array2), 1);
        
        int [] array3 = {2, 3, 4, 1, 5};
        assertEquals(findMissingElement(array3), 6);
        
    }
}
