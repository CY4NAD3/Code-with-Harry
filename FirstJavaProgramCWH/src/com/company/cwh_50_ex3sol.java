package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100); // Generates a random number between 1 and 99
    }

    int takeUserInput(){
        System.out.println("Guess the number (between 1 and 99): ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return inputNumber;
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber == number){
            System.out.println("Congratulations! You've guessed the number correctly: " + number + " in " + (getNoOfGuesses() + 1) + " attempts.");
            return true;
        }
        else if (inputNumber<number) {
            System.out.println("Too low! Try again.");
        }
        else if (inputNumber>number) {
            System.out.println("Too high! Try again.");
        }
        else {
            System.out.println("Invalid input! Please enter a number between 1 and 99.");
        }
        return false;
    }
}

public class cwh_50_ex3sol {
    public static void main(String[] args) {
        /*
        Create a class Game, chich allows a user to play "Guess the Number"
        game once. Game should have the following methods:
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of the number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        3. getter and setter for noOfGuesses
        Use properties suck as noOfGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        boolean b = false;
        while (b=true){
            g.takeUserInput();
            b = g.isCorrectNumber();
            if (b == true) {
                break;
            }
        }
    }
}
