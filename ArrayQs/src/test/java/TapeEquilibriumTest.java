import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.arrayqs.TapeEquilibrium.*;

public class TapeEquilibriumTest {
    
    @Test
    public void given_Array_returnMinimalDifference() {
        
        int[] array = {3, 1, 2, 4, 3};
        
        assertEquals(minimalDifference(array), 1);
        
    }
}
