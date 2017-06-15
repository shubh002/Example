package com.iontrading.calculator.calculator;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class CalculatorTest {
    
    private static Calculator calculator;
    
    @BeforeMethod
    public void setup()
    {
        calculator = Calculator.getInstance();
    }
    
    public void testAdd()
    {
    	
    	
        assertEquals(calculator.add(1, 2),3.0);
    }
    
    public void testSubtractSecondFromFirst()
    {
        assertEquals(calculator.subtractSecondFromFirst(1, 2),-1.0);
    }
    
    @Test
    public void testMultiply()
    {
        assertEquals(calculator.multiply(1, 2),2.0);
    }
    
    public void testDivideFirstBySecond()
    {
        assertEquals(calculator.divideFirstBySecond(1, 2),0.5);
    }

}
