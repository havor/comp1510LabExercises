package lab07;

//************************************************************
//Rock.java
//
//Play Rock, Paper, Scissors with the user
//
//************************************************************
import java.util.Scanner;
import java.util.Random;
/**
 * A class to play Rock, Paper, Scissors with the user.
 * @author Hai Hua, Tan
 * @author COMP1510 instructors
 * @version 1.0
 * */
public class Rock {
    /**
     * Main program entry. Invoked by JVM.
     * @param args the command line parameter lists. Unused.
     * */
    public static void main(String[] args) {
        final int maxPlay = 3;
        String personPlay; // User's play -- "R", "P", or "S"
        String computerPlay; // Computer's play -- "R", "P", or "S"
        int computerInt; // Randomly generated number used to determine
        // computer's play
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        String toContinue = "y";
        do {
        // Get player's play -- note that this is stored as a string
        System.out.println("Please enter your play (R, P or S)");
        personPlay = scan.next();
        // Make player's play uppercase for ease of comparison
        personPlay = personPlay.toUpperCase();
        // Generate computer's play (0,1,2)
        computerInt = generator.nextInt(maxPlay);
        // Translate computer's randomly generated play to string
        switch (computerInt) {
        case 0:
            computerPlay = "R";
            break;
        case 1:
            computerPlay = "P";
            break;
        case 2:
        default:
            computerPlay = "S";
            break;
        }
        // Print computer's play
        System.out.println("Computer play is " + computerPlay);
        // See who won. Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else if (personPlay.equals("R")) {
            if (computerPlay.equals("S")) {
                System.out.println("Rock crushes scissors. You win!!");
            } else {
                System.out.println("Paper covers rock. You lose!!");
            }

        } else if (personPlay.equals("P")) {
            if (computerPlay.equals("R")) {
                System.out.println("Paper covers rock. You win!!");
            } else {
                System.out.println("Scissors cut paper. You lose!!");
            }
        } else if (personPlay.equals("S")) {
            if (computerPlay.equals("P")) {
                System.out.println("Scissors cut paper. You win!!");
            } else {
                System.out.println("Rock crush scissors. You loss!!");
            }
        } else {
            System.out.println("You are fooling me!!");
        }
        
        System.out.println();
        System.out.println("Continue playing? (y/n)");
        scan.nextLine();
        toContinue = scan.nextLine();
        
        } while (!toContinue.equals("n"));

        scan.close();
    }
}