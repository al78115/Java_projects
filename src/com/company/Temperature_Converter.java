package com.company;

import java.util.Scanner;

public class Temperature_Converter {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for Fahrenheit to Celsius");
            System.out.println("Enter 2 for Celsius to Fahrenheit");
            int input = sc.nextInt();

            if (input == 1) {
                System.out.println("You have chosen Fahrenheit to Celsius");
                System.out.print("Enter the Fahrenheit value : ");
                double value = sc.nextDouble();
                double valueFinal = (value - 32) * 1.8;
                System.out.println("Celsius is : " + valueFinal * 10.0 / 10.0);

            } else if (input == 2) {
                System.out.println("You have chosen Celsius to Fahrenheit");
                System.out.print("Enter the Celsius value: ");
                double value1 = sc.nextDouble();
                double finalValue = (value1 * 1.8) + 32;
                System.out.println("Fahrenheit is : " + finalValue * 10.0 / 10.0);

            }
        else {
            System.out.println("Invalid choice!");
        }

    }
}
