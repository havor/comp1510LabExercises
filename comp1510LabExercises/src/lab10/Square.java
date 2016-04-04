package lab10;

//***************************************************************
//Square.java
//
//Define a Square class with methods to create and read in
//info for a square matrix and to compute the sum of a row,
//a col, either diagonal, and whether it is magic.
//
//***************************************************************
import java.util.Scanner;

public class Square {
    int[][] square;

    // --------------------------------------
    // create new square of given size
    // --------------------------------------
    public Square(int size) {
        square = new int[size][size];
    }

    // --------------------------------------
    // return the sum of the values in the given row
    // --------------------------------------
    public int sumRow(int row) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[row][i];
        }
        return sum;
    }

    // --------------------------------------
    // return the sum of the values in the given column
    // --------------------------------------
    public int sumCol(int col) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][col];
        }
        return sum;
    }

    // --------------------------------------
    // return the sum of the values in the main diagonal
    // --------------------------------------
    public int sumMainDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][i];
        }
        return sum;
        
    }

    // --------------------------------------
    // return the sum of the values in the other ("reverse") diagonal
    // --------------------------------------
    public int sumOtherDiag() {
        int sum = 0;
        int length = square.length;
        for (int i = 0; i < length; i++) {
            sum += square[i][length - 1 - i];
        }
        return sum;
    }

    // --------------------------------------
    // return true if the square is magic (all rows, cols, and diags have
    // same sum), false otherwise
    // --------------------------------------
    public boolean magic() {
        int sum = sumRow(0);
        boolean isMagic = true;
        for (int i = 0; i < square.length; i++) {
            if (sum != sumRow(i) || sum != sumCol(i)) {
                isMagic = false;
            }
        }
        if (sum != sumMainDiag() || sum != sumOtherDiag()) {
            isMagic = false;
        }
        return isMagic;
    }

    // --------------------------------------
    // read info into the square from the input stream associated with the
    // Scanner parameter
    // --------------------------------------
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
              for (int col = 0; col < square.length; col++) {
              square[row][col] = scan.nextInt();  
            }    
        }               
    }

    // ----------------------------------------
    // print the contents of the square, neatly formatted
    // ----------------------------------------
    public void printSquare() {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + "\t");
            }           
            System.out.println();
        }
    }
}