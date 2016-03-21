package lab09;

//***************************************************************
//Sales.java
//
//Reads in and stores sales for each of 5 salespeople. Displays
//sales entered by salesperson id and total sales for all salespeople.
//
//***************************************************************
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        //final int SALESPEOPLE = 5;
        //int[] sales = new int[SALESPEOPLE];
        int salespeople;
        int sum;
        int maxSale;
        int minSale;
        int maxSalePersonNo;
        int minSalePersonNo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hom many salespeople are working?");
        salespeople =  scan.nextInt();
        final int SALESPEOPLE = salespeople;
        int[] sales = new int[SALESPEOPLE];
        
        for (int i = 0; i < sales.length; i++) {
            int no = i + 1;
            System.out.print("Enter sales for salesperson " + no + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0;
        maxSale = sales[0];
        maxSalePersonNo = 0;

        minSale = sales[0];
        minSalePersonNo = 0;       
        
        for (int i = 0; i < sales.length; i++) {
            int no = i + 1;
            System.out.println("Salesperson " + no + " $" + sales[i]);
            sum += sales[i];
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxSalePersonNo = no;
            }
            
            if (sales[i] < minSale) {
                minSale = sales[i];
                minSalePersonNo = no;
            }
        }
        
        //Compute the average
        double average = (double)sum / SALESPEOPLE;
        
        System.out.println("\nTotal sales: $" + sum);
        System.out.println("\nSales average: $" + average);
        System.out.println("Salesperson " + maxSalePersonNo 
                +" had the highest sale with $" + maxSale);
        System.out.println("Salesperson " + minSalePersonNo 
                +" had the lowest sale with $" + minSale);
        
        //Prompt for an expected sale value for a single salesperson
        int expectedValue;
        int exceededCount;
        System.out.println();
        System.out.println("What's your expected sale value of a single salesperson?");
        expectedValue = scan.nextInt();
        exceededCount = 0;
        for (int i=0; i<5; i++) {
            int no = i + 1;
            if(sales[i] > expectedValue) {
                System.out.println("Salesperson " 
                                    + no
                                    + " with an amount of " 
                                    + sales[i] 
                                    + " has exceeded your expectation!");
                exceededCount++;
            }
         }           
            System.out.println();
            
            if (exceededCount > 0) {
                System.out.println("Summary: "
                            + exceededCount
                            + ((exceededCount == 1)?(" salesperson has"):(" salespeople have"))
                            + " exceeded your expectation");
            } else {
                System.out.println("Oops...Nobody has exceeded your expectation.");
            }
            

    }    
}