package lab07;

//************************************************************
//Count.java
//
//This program reads in strings (phrases) and counts the
//number of blank characters and certain other letters
//in the phrase.
//************************************************************
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        String phrase; // a string of characters
        int countBlank; // the number of blanks (spaces) in the phrase
        int countA; // the number of blanks (spaces) in the phrase
        int countE; // the number of blanks (spaces) in the phrase
        int countS; // the number of blanks (spaces) in the phrase
        int countT; // the number of blanks (spaces) in the phrase
        int length; // the length of the phrase
        char ch; // an individual character in the string
        Scanner scan = new Scanner(System.in);
        // Print a program header
        System.out.println();
        System.out.println("Character Counter");
        System.out.println();

        do {
            // Read in a string and find its length
            System.out.print("Enter a sentence or phrase (\"quit\" to exit): ");
            phrase = scan.nextLine();
            length = phrase.length();
            // Initialize counts
            countBlank = 0;
            countA = 0;
            countE = 0;
            countS = 0;
            countT = 0;
            
            // a for loop to go through the string character by character
            // and count the blank spaces
            // Print the results
            for (int i = 0; i < phrase.length(); i++){
                ch = phrase.charAt(i);
                switch (ch) {
                case ' ': 
                    countBlank++;
                    break;
                case 'a':
                case 'A':
                    countA++;
                    break;
                case 'e':
                case 'E':
                    countE++;
                    break;
                case 's':
                case 'S':
                    countS++;
                    break;                    
                case 't':
                case 'T':
                    countT++;
                    break;  
                }
            }
            
            if (!phrase.equalsIgnoreCase("quit")) {
                System.out.println();
                System.out.println("Number of blank spaces: " + countBlank);
                System.out.println("Number of A or a: " + countA);
                System.out.println("Number of E or e: " + countE);
                System.out.println("Number of S or s: " + countS);
                System.out.println("Number of T or t: " + countT);
                System.out.println();
                
            } else {
                System.out.println();
                System.out.println("Thank you for using, Bye!");
            }
        } while (!phrase.equalsIgnoreCase("quit"));
        scan.close();
    }
}