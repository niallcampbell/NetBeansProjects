/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.arrayqs.CyclicRotation.*;

/**
 *
 * @author niallcampbell
 */
public class CyclicRotationTest {

    @Test
    public void given_Array_Then_PerformCyclicRotation() {
    
        int[] array = {3, 8, 9, 7, 6};
        int[] rotatedArray = {9, 7, 6, 3, 8};
        int K = 3;
        assertArrayEquals(performCyclicRotation(array, K), rotatedArray);
        
        int[] array2 = {0, 0, 0};
        K = 1;
        assertArrayEquals(performCyclicRotation(array2, K), array2);
        
        int[] array3 = {1, 2, 3, 4};
        K = 4;
        assertArrayEquals(performCyclicRotation(array3, K), array3);
    
    }
    
    @Test
    public void given_InvalidKValue_Then_ReturnNull() {
    
        int[] array = {3, 8, 9, 7, 6};
        int K = 101;
        assertNull(performCyclicRotation(array, K));
        
        K = -1;
        assertNull(performCyclicRotation(array, K));
        
    }
}
