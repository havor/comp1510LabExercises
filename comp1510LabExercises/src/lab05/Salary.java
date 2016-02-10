package lab05;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Computes the amount of a raise and the new
 * salary for an employee. The current salary
 * and a performance rating (a String: "Excellent",
 * "Good" or "Poor") are input.
 * @author Hai Hua, Tan
 * @version 1.0
 */
public class Salary {
    /**
     * Main entry of the program.
     * @param args command line parameters, unused
     */
    public static void main(String[] args) {
        double currentSalary;
        double raise;
        double newSalary;
        String rating;
        
        final double raiseExcellent = 0.06;
        final double raiseGood = 0.04;
        final double raisePoor = 0.015;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.println("Enter the performance rating " 
                        + "(Excellent, Good, or Poor): ");
        rating = scan.next();
        
        raise = 0;
        //Computing the raise using the rating
        if (rating.equalsIgnoreCase("Excellent")) {
            raise = currentSalary * raiseExcellent;
        } else if (rating.equalsIgnoreCase("Good")) {
            raise = currentSalary * raiseGood;
        } else if (rating.equalsIgnoreCase("Poor")) {
            raise = currentSalary * raisePoor;
        } else {
            System.out.println("Invalid inputs");
        }
        
        //Compute the new salary
        newSalary = currentSalary + raise;
        
        //Print the result
        if (raise != 0) {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println();
        System.out.println("Current Salary:         " 
                            + money.format(currentSalary));
        System.out.println("Amount of your raise:   " 
                            + money.format(raise));
        System.out.println("Your new Salary:        "
                            + newSalary);
        }
    }

}
