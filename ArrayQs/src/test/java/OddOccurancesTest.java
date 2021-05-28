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

import static com.niall.arrayqs.OddOccurrencesInArray.*;

/**
 *
 * @author niallcampbell
 */
public class OddOccurancesTest {
    
    public OddOccurancesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void given_Array_ReturnOddOccurance() {
    
        int [] array = {9,3,9,3,9,7,9};
        assertEquals(getOddOccurance(array), 7);
        
        int [] array2 = {7,3,7,3,7,9,7};
        assertEquals(getOddOccurance(array2), 9);
    
    }
    
    @Test
    public void given_EvenArray_ReturnMinusOne() {
    
        int [] array = {9,3,9,3,9,7,9,7};
        
        assertEquals(getOddOccurance(array), -1);
    
    }
    
    @Test
    public void given_EmptyArray_ReturnMinusOne() {
    
        int [] array = {};
        
        assertEquals(getOddOccurance(array), -1);
    
    }

    
}
