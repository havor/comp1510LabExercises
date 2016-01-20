// ************************************************************
// Circle.java
//
// Print the area of a circle with two different radiuses
// ************************************************************
package lab02;

public class Circle {
    static final double PI = 3.14159;
    public static void main(String[] args){
                
        //declare and initialize radius, area and circumference
        int radius = 10;
        double area = PI * radius * radius; 
        double circumference = 2 * PI * radius;
        
        //print the area and circumference of the first circle with radius 10
        System.out.println("======================================");
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
        
        
        //assign radius with new value 20
        radius = 20;
        
        //compute the new area and circumference
        area = PI * radius * radius;
        circumference = 2 * PI * radius;
        
        System.out.println("======================================");
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
       
    }

}
