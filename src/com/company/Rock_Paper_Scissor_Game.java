package com.company;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        while (true) try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 0 for rock,1 for paper, 2 for scissor");
            int userInput = sc.nextInt();

            Random rm = new Random();
            int computerInput = rm.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("Draw");
            }
            else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 2 || userInput == 2 && computerInput == 0) {
                System.out.println("you Win");

            }
            else {

                System.out.println("computer win");
            }
            System.out.println("computer has input:" + computerInput);
        }
        catch (Exception e){
            System.out.println("Continuous exception");
        }
    }
}