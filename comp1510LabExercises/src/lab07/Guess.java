package lab07;

//************************************************************
//Guess.java
//
//Play a game where the user guesses a number from 1 to 10
//
//************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args) {
        int numToGuess; // Number the user tries to guess
        int guess; // The user's guess
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        // randomly generate the number to guess
        numToGuess = generator.nextInt(10) + 1;   
        // print message asking user to enter a guess
        System.out.println("I have a number. Can you guess what it is? (1-10)");

        // read in guess
         // keep going as long as the guess is wrong
        do {
            guess = scan.nextInt();
            // print message saying guess is wrong
            if (guess != numToGuess) {
                System.out.println("Opps...your guess is not my number, try again...(1-10)");
                }
        } while (guess != numToGuess);
        // print message saying guess is right
        System.out.println("Congradulations! you got it. It's " + numToGuess + " .");
    }
}