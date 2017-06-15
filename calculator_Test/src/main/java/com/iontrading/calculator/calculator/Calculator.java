package com.iontrading.calculator.calculator;

public class Calculator implements ICalculator{

    private static Calculator calculator;
    
    private Calculator() {
        
    }
    
    public static Calculator getInstance()
    {
        if(calculator == null)
            return new Calculator();
        
        return calculator;
    }
    
    public double add(double d1, double d2) {
        return d1+d2;
    }

    public double subtractSecondFromFirst(double d1, double d2) {
        return d1-d2;
        
    }

    public double multiply(double d1, double d2) {
        return d1*d2;
    }

    public double divideFirstBySecond(double d1, double d2) {
        return d1/d2;
    }

}
