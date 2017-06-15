package com.iontrading.calculator.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientInterface {
   
    private ICalculator calculator;

    public ClientInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    Scanner sc = new Scanner(System.in);

    

    public Result calculate(int choice,MyNums myNums) {
        
        Result result = new Result();
        switch (choice) {
            case 1:
                result.setValue(calculator.add(myNums.getD1(), myNums.getD2()));
                result.setResult(true);
                break;
            case 2:
                result.setValue(calculator.subtractSecondFromFirst(myNums.getD1(), myNums.getD2()));
                result.setResult(true);
                break;
            case 3:
                result.setValue(calculator.multiply(myNums.getD1(), myNums.getD2()));
                result.setResult(true);
                break;
            case 4:
                result.setValue(calculator.divideFirstBySecond(myNums.getD1(), myNums.getD2()));
                result.setResult(true);
                break;
            default:
                result.setResult(false);
             
        }
        
        return result;

    }

}
