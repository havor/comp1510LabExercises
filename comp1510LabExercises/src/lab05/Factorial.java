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
        long n;
        long result;
        
        Scanner scan = new Scanner(System.in);
       do {
        System.out.println("Please enter an positive integer: ");
        n = scan.nextInt();   
       } while(n < 0);

        result = factorial(n);
        
        if (result < 0) {
            System.out.println("n is too large!");
            } else {
            System.out.println(n + "! = " + result);        
            }
        
        
        scan.close();
        
    }
    
    /**
     * Method to calculate the factorial of a given integer.
     * @param n the integer needed to calculate.
     * @return factorial of n.
     */
    private static long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
            } else {
            return n * factorial(n - 1);
        }
    }

}
