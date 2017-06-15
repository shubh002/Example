package com.iontrading.calculator.calculator;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        ClientInterface clientInterface = new ClientInterface(calculator);
        Scanner sc = new Scanner(System.in);
        double arr[] = {12, 24, 3, 4};
        while (true) {
            System.out.println("Enter choice\n 1.Add \n 2.Subtract \n 3.Max in a Array \n  5.Exit");
            int choice = sc.nextInt();
            if (choice == 5) System.exit(0);
            if (choice == 3) {
            	clientInterface.findMax(arr);
            	continue;
            }
            double res = clientInterface.calculate(choice, 3, 1);
            if (res != 0) {
                System.out.println(res + " ");
            } else {
                System.out.println("Wrong choise");
            }

        }

    }
}
