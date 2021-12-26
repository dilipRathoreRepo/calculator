package com.diliprathore.maven.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorImplTest {
    private Calculator calculatorImpl;

    private int num1;
    private int num2;
    private int expectedResult;

    public CalculatorImplTest(int num1, int num2, int result) {
        this.num1 = num1;
        this.num2 = num2;
        this.expectedResult = result;
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][]{{-1, 2, 1}, {1, 2, 3}, {6, 7, 13}});
    }

    @Before
    public void setup() {
        calculatorImpl = new CalculatorImpl();
    }

    @Test
    public void testAdd() {
        int result = calculatorImpl.calculate(num1, num2);
        assertEquals(result, expectedResult);
    }
}