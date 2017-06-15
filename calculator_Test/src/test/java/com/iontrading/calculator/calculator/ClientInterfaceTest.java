package com.iontrading.calculator.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iontrading.calculator_support.MockCalculator;

@Test
public class ClientInterfaceTest {

    private ClientInterface clientInterface;
    private MockCalculator mockCalculator;
    
    public void setup()
    {
        mockCalculator =  new MockCalculator();
        clientInterface = new ClientInterface(mockCalculator);
    }
   
    
    public void testCalculateAdd()
    {
       MyNums myNums = new MyNums();
       myNums.setD1(1.1);
       myNums.setD2(1.2);
       mockCalculator.setAdd(2.3);
       double d = clientInterface.calculate(1, myNums).getValue();
       Assert.assertEquals(d,2.3);
    }
    
    public void testCalculateSub()
    {
        MyNums myNums = new MyNums();
        myNums.setD1(2);
        myNums.setD2(1);
        mockCalculator.setSubtract(1.0);
        double d = clientInterface.calculate(2, myNums).getValue();
        Assert.assertEquals(d,1.0);
        
    }
    
    public void testCalculateMul()
    {
        MyNums myNums = new MyNums();
        myNums.setD1(2);
        myNums.setD2(1);
        mockCalculator.setMultiply(2.0);
        double d = clientInterface.calculate(3, myNums).getValue();
        Assert.assertEquals(d,2.0);
    }
    
    public void testCalculateDivide()
    {
        MyNums myNums = new MyNums();
        myNums.setD1(2);
        myNums.setD2(1);
        mockCalculator.setDivide(2.0);
        double d = clientInterface.calculate(4, myNums).getValue();
        Assert.assertEquals(d,2.0);
    }
    
    public void testCalculateDivideByZero()
    {
        MyNums myNums = new MyNums();
        myNums.setD1(2);
        myNums.setD2(0);
        mockCalculator.setDivide(Double.POSITIVE_INFINITY);
        double d = clientInterface.calculate(3, myNums).getValue();
        Assert.assertEquals(d,Double.POSITIVE_INFINITY);
    }
    
}
