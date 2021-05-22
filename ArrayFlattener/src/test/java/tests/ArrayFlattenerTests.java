package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.mycompany.arrayflattener.ArrayFlattener;

/**
 *
 * @author niallcampbell
 */
public class ArrayFlattenerTests {
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Beginning Array Flatten Tests");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Tests completed");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("Test");
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void flatten2DArraySuccessfully() {
        Integer[][] array = {{1, 2}, {3, 4}};
        Integer[] flattenedArray = {1, 2 ,3 , 4};
        
        assertArrayEquals(ArrayFlattener.flattenArray(array), flattenedArray );
    }
    
    @Test
    public void givenNullValueReturnNull() {
        assertNull(ArrayFlattener.flattenArray(null));
    }
}
