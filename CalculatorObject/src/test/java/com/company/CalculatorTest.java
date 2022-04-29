package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    private void shouldAddTwoIntegers() {
        assertEquals(2, calculator.add(1,1));
        assertEquals(-8, calculator.add(-20,12));
    }

    @Test
    private void shouldAddTwoDoubles() {
        assertEquals(5.7, calculator.add(3.4,2.3));
        assertEquals(32.50001, calculator.add(1.00001,31.5));
    }

    @Test
    private void shouldSubtractTwoIntegers() {
        assertEquals(-29, calculator.subtract(23,52));
        assertEquals(0, calculator.subtract(1000,1000));
    }

    @Test
    private void shouldSubtractTwoDoubles() {
        assertEquals(5.0, calculator.subtract(5.5,0.5));
        assertEquals(0.1, calculator.subtract(-5.1,-5.2));
    }

    @Test
    private void shouldMultiplyTwoIntegers() {
        assertEquals(68, calculator.multiply(34,2));
        assertEquals(1000000, calculator.multiply(1000,1000));
    }

    @Test
    private void shouldMultipleTwoDoubles() {
        assertEquals(29.48, calculator.multiply(6.7,4.4));
        assertEquals(8.47, calculator.multiply(7.7,1.1));
    }

    @Test
    private void shouldDivideTwoIntegers() {
        assertEquals(1.714, calculator.divide(12,7));
        assertEquals(4, calculator.divide(12,3));

    }

    @Test
    private void shouldDivideTwoDoubles() {
        assertEquals(49.09, calculator.divide(10.8,2.2));
        assertEquals(442.482, calculator.divide(1000.01,2.26));
    }
}