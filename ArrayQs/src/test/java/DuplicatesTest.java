import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.arrayqs.Duplicates.*;

public class DuplicatesTest {
    
    @Test
    public void given_Array_Then_removeDuplicates() {
    
        int[] array = {1, 2, 3, 4, 2, 1, 3};
        int[] noDuplicatesArray = {1, 2, 3, 4};
        
        assertArrayEquals(removeDuplicateValues(array), noDuplicatesArray);
    
    }
    
    @Test
    public void given_Array_Then_returnDuplicateValues() {
        
        int[] array = {1, 2, 3, 4, 2, 1, 4, 5};
        int[] duplicatesArray = {1, 2, 4};
        
        assertArrayEquals(findDuplicateValues(array), duplicatesArray);
        
    }
    
}
