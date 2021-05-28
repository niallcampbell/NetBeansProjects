package FrogJumpTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.frogjump.FrogJump.*;

public class FrogJumpTest {
    
    @Test
    public void given_Coordinates_Then_ReturnNumberOfJumps() {
        
        assertEquals(frogJump(10, 85, 30), 3);
        assertEquals(frogJump(10, 90, 20), 4);
        assertEquals(frogJump(5, 6, 3), 1);
        assertEquals(frogJump(5, 5, 3), 0);
        
    }
    
}
