package com.uwasa.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // --- Section 3: Implementation & Unit Testing ---
    
    @Test
    public void testNormalAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }
    
    @Test
    public void testNormalSubtraction() {
        assertEquals(1, calculator.subtract(4, 3), "4 - 3 should equal 1");
    }
    
    @Test
    public void testNormalMultiplication() {
        assertEquals(12, calculator.multiply(3, 4), "3 * 4 should equal 12");
    }
    
    @Test
    public void testNormalDivision() {
        assertEquals(2.5, (double) calculator.divide(5, 2), 0.001, "5 / 2 should equal 2.5");
    }
    
    @Test
    public void testDivisionByZeroEdgeCase() {
        assertEquals("Error: Division by zero", calculator.divide(5, 0), "Should return error string for division by zero");
    }

    // --- Section 4: Black-Box Testing (BVA and EP) ---
    // Boundaries: Integer.MAX_VALUE, Integer.MIN_VALUE, 0, negative values
    
    @Test
    public void testAdditionBoundaryMaxValue() {
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1), "Max value addition overflow");
    }

    @Test
    public void testMultiplicationWithZero() {
        assertEquals(0, calculator.multiply(Integer.MAX_VALUE, 0), "Any number multiplied by 0 is 0");
    }

    @Test
    public void testDivisionWithNegativeInputs() {
        assertEquals(2.0, (double) calculator.divide(-10, -5), 0.001, "Negative inputs division");
    }

    // --- Section 5: White-Box Testing (Branch Coverage) ---
    // Specifically target the `if (b == 0)` branch and standard branch
    
    @Test
    public void testDivideBranchCoverage_Standard() {
        // Triggers the regular return branch
        Object result = calculator.divide(10, 5);
        assertTrue(result instanceof Double, "Standard division should return Double");
        assertEquals(2.0, (double) result, 0.001);
    }
    
    @Test
    public void testDivideBranchCoverage_Zero() {
        // Triggers the b==0 branch
        Object result = calculator.divide(10, 0);
        assertTrue(result instanceof String, "Division by zero should return String");
        assertEquals("Error: Division by zero", result);
    }

    // --- Section 6: Test-Driven Development ---
    // Power feature failing test initially
    
    @Test
    public void testCalculatePower() {
        // 2^3 = 8
        assertEquals(8, calculator.calculatePower(2, 3), "2 raised to the power of 3 should be 8");
    }
}
