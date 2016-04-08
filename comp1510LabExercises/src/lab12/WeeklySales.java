package lab12;

import java.util.Scanner;

//******************************************************************
//WeeklySales.java
//
//Sorts the sales staff in descending order by sales.
//******************************************************************
public class WeeklySales
{
public static void main(String[] args)
{
    /*
Salesperson[] salesStaff = new Salesperson[10];
salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
salesStaff[2] = new Salesperson("James", "Jones", 3000);
salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
salesStaff[4] = new Salesperson("Don", "Trump", 1570);
salesStaff[5] = new Salesperson("Jane", "Black", 3000);
salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
salesStaff[9] = new Salesperson("Walt", "Smith", 3000);
*/
int size;
Scanner scan = new Scanner(System.in);
System.out.println("How many salespersons are working in the company?");
size = scan.nextInt();
Salesperson[] salesStaff = new Salesperson[size];
System.out.println("Please enter the staff informaiton:");
String firstName;
String lastName;
int sales;

for (int i = 0; i < size; i++) {
    System.out.println("Salesperson " + (i+1));
    System.out.println("First name:");
    firstName = scan.next();
    System.out.println("Last name:");
    lastName = scan.next();
    System.out.println("Sales:");
    sales = scan.nextInt();
    salesStaff[i] = new Salesperson(firstName, lastName, sales);
}
Sorting.insertionSort(salesStaff);
System.out.println ("\nRanking of Sales for the Week\n");
for (Salesperson s : salesStaff)
System.out.println (s);
}
}