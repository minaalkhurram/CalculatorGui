package CalculatorGui;

import CalculatorGui.Calculator;
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(10, 20, "+");
        assertEquals(30, result, 0);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(30, 10, "-");
        assertEquals(20, result, 0);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(5, 5, "*");
        assertEquals(25, result, 0);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(10, 0, "/");
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testInvalidOperator() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(5, 5, "%"); // Using an invalid operator
        assertTrue(Double.isNaN(result));
    }

}
