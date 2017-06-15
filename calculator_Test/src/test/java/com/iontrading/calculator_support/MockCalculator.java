package com.iontrading.calculator_support;

import com.iontrading.calculator.calculator.ICalculator;

public class MockCalculator implements ICalculator {

    private double value;

    public double add(double d1, double d2) {
        return value;
    }

    public void setAdd(double d) {
        this.value = d;
    }

    public double subtractSecondFromFirst(double d1, double d2) {
        return value;
    }

    public void setSubtract(double d) {
        this.value = d;
    }

    public double FindMax(double[] arr) {
        return value;
    }

    public void setfindMax(double max) {
        this.value = max;
    }

}
