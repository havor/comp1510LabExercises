// ************************************************************
// Circle.java
//
// Print the area of a circle with two different radiuses
// ************************************************************
package lab02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    static final double PI = 3.14159;
    public static void main(String[] args){
                
        //declare and initialize radius, area and circumference
        int radius1 = 10;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a value for the radius:");
        radius1 = scan.nextInt();
        
        double area1 = PI * radius1 * radius1; 
        double circumference1 = 2 * PI * radius1;
        
        DecimalFormat nfm = new DecimalFormat("###.###");
        
        //print the area and circumference of the first circle with radius 10
        System.out.println("===================Circle 1=======================");
        System.out.println("The area of a circle with radius " + radius1 + " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius1 + " is " + nfm.format(circumference1));
        
        
        //assign radius with new value 20
        int radius2 = 2 * radius1;
        
        //compute the new area and circumference
        double area2 = PI * radius2 * radius2;
        double circumference2 = 2 * PI * radius2;
        
        System.out.println("====================Circle 2======================");
        System.out.println("The area of a circle with radius " + radius2 + " is " + nfm.format(area2));
        System.out.println("The circumference of a circle with radius " + radius2 + " is " + nfm.format(circumference2));
        
        
        double areaRatio = area2 / area1;
        double circumferenceRatio = circumference2 / circumference1;
        
        System.out.println("==================Area and Circumference Changes====================");
        System.out.println("When radius doubles from 10 to 20, the new area is " 
                            + areaRatio + " times the original one,\n"
                            + "the new circumference is " 
                            + nfm.format(circumferenceRatio) 
                            + " times the original one.\n");
        
        

       
    }

}
