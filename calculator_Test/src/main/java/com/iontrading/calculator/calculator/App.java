package com.iontrading.calculator.calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = Calculator.getInstance();
        ClientInterface clientInterface = new ClientInterface(calculator);
        MyNums myNums = new MyNums();
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter choice\n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide \n 5.Exit");
            int choice = sc.nextInt();
            if(choice==5)
                System.exit(0);
            myNums.setD1(sc.nextDouble());
            myNums.setD2(sc.nextDouble());
            
            Result result = clientInterface.calculate(choice,myNums);
            if(result.isResult())
            {
                System.out.println(result.getValue());
            }
            
            
        }
        
    }
}
