package lab04;

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 * Computes the price of a deli item given the weight.
 * @author Haihua (Ryan), Tan
 * @version 1.0
 */
public class Deli {
    /**
     * Main Entry of the program.
     * @param args is unused.
     */
    public static void main(String[] args) {
        final double ouncePerPound = 16.0;
        double pricePerPound; // price per pound
        double weightOunces; // weight in ounces
        double weight; // weight in pounds
        double totalPrice; // total price for the item
        Scanner scan = new Scanner(System.in);
        // Declare money as a NumberFormat object and use the
        // getCurrencyInstance method to assign it a value
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // Declare fmt as a DecimalFormat object and instantiate
        // it to format numbers with at least one digit to the left of the
        // decimal and the fractional part rounded to two digits.
        // prompt the user and read in each input
        DecimalFormat fmt = new DecimalFormat("#.##");
        
        System.out.println("Welcome to the CS Deli! ! \n ");
        System.out.print("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();
        System.out.print("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();
        // Convert ounces to pounds and compute the total price
        weight = weightOunces / ouncePerPound;
        totalPrice = pricePerPound * weight;
        
        System.out.println();
        
        System.out.println("***** CSDeli *****");
        System.out.println();
        
        // Print the label using the formatting objects
        System.out.println("Unit Price: " 
                            + money.format(pricePerPound) 
                            + " per pound");
        // fmt for the weight in pounds and money for the prices
        System.out.println("Weight: " 
                            + fmt.format(weight)
                            + " pounds");
        System.out.println();
        System.out.println("TOTAL: " + money.format(totalPrice));
        scan.close();
    }
}
