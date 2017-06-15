package com.iontrading.calculator_support;

import com.iontrading.calculator.calculator.ICalculator;
import com.iontrading.calculator.calculator.Result;

public class MockCalculator implements ICalculator{

    private Result result = new Result();
    
    public double add(double d1, double d2) {
        return result.getValue();
    }

    public void setAdd(double d)
    {
        result.setValue(d);;
    }
    
    public double subtractSecondFromFirst(double d1, double d2) {
        return result.getValue();
    }
    
    public void setSubtract(double d)
    {
        result.setValue(d);
    }

    public double multiply(double d1, double d2) {
        return result.getValue();
    }

    public void setMultiply(double d)
    {
        result.setValue(d);;
    }
    
    public double divideFirstBySecond(double d1, double d2) {
        return result.getValue();
    }

    public void setDivide(double d)
    {
        result.setValue(d);
    }
   

}

