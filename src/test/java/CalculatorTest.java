import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {

    private static final double DELTA = 0.00000005;
   Calculator calculator = new Calculator();
    @Test
    public void squareRootPositive(){
        assertEquals("Positive Test Case: squareRoot, ", 7, calculator.squareRoot(49), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", 0, calculator.squareRoot(0), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", Double.NaN, calculator.squareRoot(-9), DELTA);
    }

    @Test
    public void squareRootNegative(){
        assertNotEquals("Negative Test Case: squareRoot, ", 7, calculator.squareRoot(85), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 85, calculator.squareRoot(0), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 3.2556, calculator.squareRoot(-8), DELTA);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Positive Test Case: Factorial, ", 120, calculator.factorial(5), DELTA);
        assertEquals("Positive Test Case: Factorial, ", 6, calculator.factorial(3), DELTA);
       // assertEquals("Positive Test Case: Factorial, ", Double.NaN, calculator.factorial(-5), DELTA);
    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Negative Test Case: Factorial,", 284, calculator.factorial(8), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 785, calculator.factorial(6), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 890, calculator.factorial(-28), DELTA);
    }

    @Test
    public void calPowPositive() {
        assertEquals("Positive Test Case: Power, ", 16, calculator.cal_pow(4, 2), DELTA);
        assertEquals("Positive Test Case: Power,", 0.0625, calculator.cal_pow(4, -2), DELTA);
        //assertEquals("Positive Test Case: Power, ", Double.NaN, calculator.cal_pow(0, 0), DELTA);
    }


    @Test
    public void calPowNegative() {
        assertNotEquals("Negative Test Case: Power, ", 260, calculator.cal_pow(6, 6), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 166, calculator.cal_pow(5, 2), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 8, calculator.cal_pow(0, 0), DELTA);
    }

    @Test
    public void logPositive() {
        assertEquals("Positive Test Case: Log, ", 2.302585092994, calculator.cal_natural_log(10), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NEGATIVE_INFINITY, calculator.cal_natural_log(0), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NaN, calculator.cal_natural_log(-7), DELTA);
    }

    @Test
    public void logNegative(){
        assertNotEquals("Negative Test Case: Log, ", 3.567, calculator.cal_natural_log(4), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 5, calculator.cal_natural_log(45), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 6, calculator.cal_natural_log(-4), DELTA);
    }
}
