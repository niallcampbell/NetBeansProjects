/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryGapTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import static com.niall.binarygap.BinaryGap.*;

/**
 *
 * @author niallcampbell
 */
public class IntToBinaryTests {
    
    public IntToBinaryTests() {
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
    public void given_intValue_Then_ReturnBinaryString() {
    
        assertEquals(convertIntToBinary(9), "1001");
        assertEquals(convertIntToBinary(1041), "10000010001");
    
    }
    
    @Test public void given_ArrayList_Then_returnLargestValue() {
        
        assertEquals(getLargestValueInList(null), 0);
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(2);
        assertEquals(getLargestValueInList(list1), 3);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(2);
        list2.add(5);
        assertEquals(getLargestValueInList(list2), 5);
    
    }
    
    @Test
    public void given_intValue_ThenReturnLargestBinaryGap() {
    
        assertEquals(findLargestBinaryGap(1041), 5);
        assertEquals(findLargestBinaryGap(20), 1);
        assertEquals(findLargestBinaryGap(2), 0);
    
    
    }
    
}
