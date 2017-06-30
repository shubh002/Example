package com.iontrading.calculator.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.iontrading.calculator_support.MockCalculator;

@Test
public class ClientInterfaceTest {

    private ClientInterface clientInterface;

    private MockCalculator mockCalculator;

    @BeforeClass
    public void setup() {
        mockCalculator = new MockCalculator();
        clientInterface = new ClientInterface(mockCalculator);
    }

    public void testCalculateAdd() {
        mockCalculator.setAdd(20.0);
        double d = clientInterface.calculate(1, 10, 10);
        Assert.assertEquals(d, 20.0);
    }

    public void testCalculateSub() {
        mockCalculator.setSubtract(5.0);
        double d = clientInterface.calculate(2, 20, 15);
        Assert.assertEquals(d, 5.0);

    }

    public void testFindMax() {
        double arr[] = {1, 2, 3, 4};
        mockCalculator.setfindMax(4);
        double d = clientInterface.findMax(arr);
        Assert.assertEquals(d, 4.0);

    }
}
