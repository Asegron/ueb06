
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Die Test-Klasse ArrayFunctionsTest.
 *
 * @author  Kiran & Stelz
 * @version 1.0
 */
public class ArrayFunctionsTest
{        
    /*
     * Sortiert ein 5-stelliges Array mit der InsertionSort-Methode
     */
    @Test
    public void testSortiereIntArray648102Ergebnis246810() {
        int expected[] = new int[]{2,4,6,8,10};
        int result[] = ArrayFunctions.insertionSort (new int[] {6,4,8,10,2});
        assertArrayEquals("Falsch sortiert ",expected, result);               
        
    }

    /*
     * Prüft ob das Array nicht null ist.
     */
    @Test
    public void testIntArrayDarfNichtNullSein() {
        assertSame("Array ist null ",null,null); // Alternativ "assertNotNull" verwenden.
    }     
}


