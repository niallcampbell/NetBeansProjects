package sortingtests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.sortingalgorithms.Quicksort.*;

public class QuicksortTest {
    
    @Test
    public void GIVEN_array_THEN_quicksortTheArray() {
        
        int[] nums = {10,5,9,3,6,1,7,4,2,8};
        int[] result = {1,2,3,4,5,6,7,8,9,10};
        quicksort(nums, 0, nums.length - 1);
        assertArrayEquals(nums, result);
    }
    
}
