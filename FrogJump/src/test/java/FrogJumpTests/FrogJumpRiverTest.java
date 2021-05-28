package FrogJumpTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.frogjump.FrogJumpRiver.*;

public class FrogJumpRiverTest {
    
    @Test
    public void given_Array_frogCanJumpRiver() {
        
        int[] array = {1,3,1,4,2,3,5,4};
        assertEquals(frogJumpRiver(5, array), 6);
        
    }
    
    @Test
    public void given_Array_frogCannotJumpRiver() {
        
        int[] array = {1,1,4,2,5,4};
        assertEquals(frogJumpRiver(5, array), -1);
        
    }
    
}
