import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {

    private static final double DELTA = 0.00000005;

    @Test
    public void squareRootPositive(){
        assertEquals("Positive Test Case: squareRoot, ", 7, Calculator.squareRoot(49), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", 0, Calculator.squareRoot(0), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", Double.NaN, Calculator.squareRoot(-9), DELTA);
    }

    @Test
    public void squareRootNegative(){
        assertNotEquals("Negative Test Case: squareRoot, ", 7, Calculator.squareRoot(85), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 85, Calculator.squareRoot(0), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 3.2556, Calculator.squareRoot(-8), DELTA);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Positive Test Case: Factorial, ", 120, Calculator.factorial(5), DELTA);
        assertEquals("Positive Test Case: Factorial, ", 6, Calculator.factorial(3), DELTA);
        assertEquals("Positive Test Case: Factorial, ", Double.NaN, Calculator.factorial(-5), DELTA);
    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Negative Test Case: Factorial,", 284, Calculator.factorial(8), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 785, Calculator.factorial(6), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 890, Calculator.factorial(-28), DELTA);
    }

    @Test
    public void calPowPositive() {
        assertEquals("Positive Test Case: Power, ", 16, Calculator.cal_pow(4, 2), DELTA);
        assertEquals("Positive Test Case: Power,", 0.0625, Calculator.cal_pow(4, -2), DELTA);
        assertEquals("Positive Test Case: Power, ", Double.NaN, Calculator.cal_pow(0, 0), DELTA);
    }


    @Test
    public void calPowNegative() {
        assertNotEquals("Negative Test Case: Power, ", 260, Calculator.cal_pow(6, 6), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 166, Calculator.cal_pow(5, 2), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 8, Calculator.cal_pow(0, 0), DELTA);
    }

    @Test
    public void logPositive() {
        assertEquals("Positive Test Case: Log, ", 2.302585092994, Calculator.cal_natural_log(10), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NEGATIVE_INFINITY, Calculator.cal_natural_log(0), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NaN, Calculator.cal_natural_log(-7), DELTA);
    }

    @Test
    public void logNegative(){
        assertNotEquals("Negative Test Case: Log, ", 3.567, Calculator.cal_natural_log(4), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 5, Calculator.cal_natural_log(45), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 6, Calculator.cal_natural_log(-4), DELTA);
    }
}
