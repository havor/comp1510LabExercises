package lab05;

import java.util.Scanner;

/**
 * A class to calculate the factorial of a number which is input by users.
 * @author Hai Hua, Tan
 * @version 1.0
 */
public class Factorial {
    /**
     * Main entry of the program.
     * @param args the command line parameters, unused.
     */
    public static void main(String[] args) {
        int n;
        int result;
        
        Scanner scan = new Scanner(System.in);
       do{
        System.out.println("Please enter an positive integer: ");
        n = scan.nextInt();   
       } while(n < 0);

        result = factorial(n);
        
        System.out.println(n + "! = " + result + ".");
        
    }
    
    /**
     * Method to calculate the factorial of a given integer.
     * @param n the integer needed to calculate.
     * @return factorial of n.
     */
    private static int factorial(int n) {
        if (n <= 0) {
            return 1;
            } else {
            return n * factorial(n - 1);
        }
    }

}
