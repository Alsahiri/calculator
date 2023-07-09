package com.calculator.calculator;

import com.calculator.calculator.exceptions.InvalidDivisionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateServiceImpTest {
    private CalculateService calculateService = new CalculateServiceImp();
    @Test
    public void testPlus() {
        String actual = calculateService.plus(1, 3);
        assertEquals("1 + 3 = 4", actual);
        String actual2 = calculateService.plus(20, -15);
        assertEquals("20 + -15 = 5", actual2);
    }

    @Test
    public void testMinus() {
        String actual = calculateService.minus(1, 3);
        assertEquals("1 - 3 = -2", actual);
        String actual2 = calculateService.minus(20, -15);
        assertEquals("20 - -15 = 35", actual2);
    }

    @Test
    public void testMultiply() {
        String actual = calculateService.multiply(1, 3);
        assertEquals("1 * 3 = 3", actual);
        String actual2 = calculateService.multiply(2, -15);
        assertEquals("2 * -15 = -30", actual2);
    }

    @Test
    public void testDivide() {
        String actual = calculateService.divide(3, 1);
        assertEquals("3 / 1 = 3.0", actual);
        String actual2 = calculateService.divide(20, 5);
        assertEquals("20 / 5 = 4.0", actual2);
    }
@Test
    public void testDivideWithException() {
    assertThrows(InvalidDivisionException.class, () -> calculateService.divide(1, 0));
    }
}