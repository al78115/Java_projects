package com.company;

import java.util.Random;
import java.util.Scanner;

class Game {
    int number;
    int inputNumber;
    int no_of_guesses = 0;


    Game() {
        Random rm = new Random();
        this.number = rm.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean iSCorrectNumber() {
        no_of_guesses++;
        if (inputNumber == number) {
            System.out.format("you guess it correct ,it was %d \n you guessed it in %d attempt\n", number, no_of_guesses);
            return true;
        }
        else if (inputNumber < number) {

            System.out.println("too low...");
        } else if (inputNumber > number) {

            System.out.println("too high...");
        }
        return false;
    }
}
    public class Guessing_the_Number {
        public static void main(String[] args) {
            Game g = new Game();
            boolean b=false;

            while (!b) {

                g.takeUserInput();
                b=g.iSCorrectNumber();
                System.out.println(b);


            }
        }
    }