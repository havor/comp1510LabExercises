package lab10;

import java.io.File;
import static java.io.File.separator;
import java.io.IOException;
//***************************************************************
//SquareTest.java
//
//Uses the Square class to read in square data and tell if
//each square is magic.
//
//***************************************************************
import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(new File("magicData"));
        int count = 1; // count which square we're on
        int size = scan.nextInt(); // size of next square
        // Expecting -1 at bottom of input file
        while (size != -1) {
            // create a new Square of the given size
            Square square = new Square(size);
            // call its read method to read the values of the square
            System.out.println("\n******** Square " + count + " ********");
            square.readSquare(scan);
            // print the square
            square.printSquare();
            // print the sums of its rows
            System.out.println("Sums of rows:");
            for (int i = 0; i < size; i++) {
                System.out.println("Row " 
                                    + i
                                    + ": "
                                    + square.sumRow(i));
            }
            System.out.println(square.sumRow(0));
            // print the sums of its columns
            for (int i = 0; i < size; i++) {
                System.out.println("Col " 
                                    + i
                                    + ": "
                                    + square.sumCol(i));
            }
            // print the sum of the main diagonal
            System.out.println("Main diagonal: " + square.sumMainDiag());
            // print the sum of the other diagonal
            System.out.println("Other diagonal: " + square.sumOtherDiag());
            // determine and print whether it is a magic square
            System.out.println("The square "
                            + ((square.magic()) ? "is " : "is not ")
                            + "a magic square.");
            // get size of next square
            size = scan.nextInt();
        }
    }
}
