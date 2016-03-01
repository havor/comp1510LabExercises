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
        System.out.println("I have a number. Can you guess it is? (1-10)");
        guess = scan.nextInt();
        // read in guess
         // keep going as long as the guess is wrong
        do {
            // print message saying guess is wrong
            System.out.println("Opps...your guess is not my number, try again...(1-10)");
            // get another guess from the user
            guess = scan.nextInt();
        } while (guess != numToGuess);
        // print message saying guess is right
        System.out.println("Congradulations! you got it. It's " + numToGuess + " .");
    }
}