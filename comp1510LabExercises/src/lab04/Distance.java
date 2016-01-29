package lab04;

import java.util.Scanner;

/**
 *Computes the distance between two points.
 *@author Haihua (Ryan), Tan
 *@version 1.0
 **/
public class Distance {
    
    /**
     * Entry of the program.
     * @param args is unused
     */
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2; // coordinates of two points
        double distance; // distance between the points
        Scanner scan = new Scanner(System.in);
        
        // Read in the two points
        System.out.print("Enter the coordinates of the first point " 
                            + "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        
        System.out.print("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        distance = Math.sqrt(Math.pow((x2 - x1), 2.0) 
                            + Math.pow((y2 - y1), 2.0));
        System.out.println("The distance of (" 
                            + x1
                            + ", "
                            + y1
                            + ") and ("
                            + x2
                            + ", "
                            + y2
                            + ") is "
                            + distance);
         scan.close();  
    }
}
