package com.iontrading.calculator.calculator;

public class Calculator implements ICalculator {

    private static Calculator calculator;

    public double add(double d1, double d2) {
        return d1 + d2;
    }

    public double subtractSecondFromFirst(double d1, double d2) {
        return d1 - d2;
    }

    public double FindMax(double[] arr) {
        double temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>temp) 
            {
            	temp=arr[i];
            }
        }
        System.out.println("Max is" + temp);
        return temp;
    }

}
