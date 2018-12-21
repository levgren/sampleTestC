import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() { assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5)); }

    @Test
    public void testMultiplyZeroAndPositiveValues() { assertEquals("0 * 5 must be 0", 0, calc.multiply(0, 5)); }

    @Test
    public void testDivideTwoPositiveValues() { assertEquals("30 / 5 must be 6", 6, calc.divide(30, 5)); }
    //test

    @Test
    public void testSubstractTwoPositiveValues() { assertEquals("30 - 5 must be 25", 25, calc.substract(30, 5)); }

    @Test
    public void testSquareRootTwoPositiveValues() { assertEquals("Square Root of 36 must be 6", 6.0, calc.sqrt(36)); }

    //TODO
    //add new tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
