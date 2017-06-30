package com.iontrading.calculator.calculator;

import java.util.Scanner;

public class ClientInterface {

    private ICalculator calculator;

    public ClientInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    Scanner sc = new Scanner(System.in);
    public double calculate(int choice, int num1, int num2) {
        switch (choice) {
            case 1:
                return calculator.add(num1, num2);
            case 2:
                return calculator.subtractSecondFromFirst(num1, num2);
           
        }
        return 0;
    }

    public double findMax(double arr[]) {
        return calculator.FindMax(arr);
    }

}
