package com.iontrading.calculator.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public void setup() {
        calculator = new Calculator();
    }

    public void testAdd() {

        double res = calculator.add(1, 2);
        Assert.assertEquals(res, 3.0);
    }

    public void testSubtractSecondFromFirst() {
        double res = calculator.subtractSecondFromFirst(1, 2);
        Assert.assertEquals(res, -1.0);
    }

    public void testFindMax() {
        double arr[] = {1, 2, 3, 4};
        double res = calculator.FindMax(arr);
        Assert.assertEquals(res, 4.0);
    }
}
