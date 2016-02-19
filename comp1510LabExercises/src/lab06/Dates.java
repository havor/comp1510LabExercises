package lab06;

//************************************************************
//Dates.java
//
//Determine whether a 2nd-millenium date entered by the user
//is valid
//************************************************************
import java.util.Scanner;

/**
 * A class to determine whether a 2nd-millenium date entered 
 * by the user is valid.
 * @author Hai Hua, Tan
 * @version 1.0
 */
public class Dates {
        /**
         * Program main entry method, invoked by JVM.
         * @param args command line parameter lists, unused.
         */

    public static void main(String[] args) {
        final int monthOfYear = 12;
        final int startYear = 1000;
        final int endYear = 1999;
        
        final int leapFactor4 = 4;
        final int leapFactor100 = 100;
        final int leapFactor400 = 400;
        
        final int feb = 2;
        final int apr = 4;
        final int jun = 6;
        final int sept = 9;
        final int oct = 11;
        
        final int dayOfNormalMonth = 30;
        final int dayOfNormalFebruary = 28;
        
        // date read in from user
        int month;
        int day;
        int year; 
        
        // number of days in month read in
        int daysInMonth; 
        
        // true if input from user is valid
        boolean monthValid;
        boolean yearValid; 
        boolean dayValid; 
                                                 
        boolean leapYear; // true if user's year is a leap year
        
        
        
        Scanner scan = new Scanner(System.in);
        // Get integer month, day, and year from user
        System.out.println("Please enter a year (1000-1999): ");
        year = scan.nextInt();
        
        System.out.println("Please enter a month (1-12): ");
        month = scan.nextInt();
        
        System.out.println("Please enter a day (1-31): ");
        day = scan.nextInt();
        
        // Check to see if month is valid
        monthValid = false;
        if (month > 0 && month <= monthOfYear) {
            monthValid = true;
        }
        
        // Check to see if year is valid
        yearValid = false;
        if (year >= startYear && year <= endYear) {
            yearValid = true;
        }
        
        // Determine whether it's a leap year
        leapYear = false;
        if (yearValid) {
            if (year % leapFactor4 != 0) {
                leapYear = false;
            } else if (year % leapFactor100 != 0) {
                leapYear = true;
            } else if (year % leapFactor400 != 0) {
                leapYear = false;
            } else {
                leapYear = true;
            }
        }
        
        // Determine number of days in month
        switch(month) {
        case apr:
        case jun:
        case sept:
        case oct:
            daysInMonth = dayOfNormalMonth;
            break;
        case feb:
            if (leapYear) {
                daysInMonth = dayOfNormalFebruary + 1;
            } else {
                daysInMonth = dayOfNormalFebruary;
            }
            break;
        default:
            daysInMonth = dayOfNormalMonth + 1;
            break;      
        }
        
        // User number of days in month to check to see if day is valid
        dayValid = false;
        if (day > 0 && day <= daysInMonth) {
            dayValid = true;
        }
        
        // Determine whether date is valid and print appropriate message
        if (yearValid && monthValid && dayValid) {
            System.out.println(year 
                                + "/" 
                                + month 
                                + "/"
                                + day
                                + " is a valid date.");
        } else {
            System.out.println(year 
                    + "/" 
                    + month 
                    + "/"
                    + day
                    + " is not a valid date.");
        }
        scan.close();
    }
}