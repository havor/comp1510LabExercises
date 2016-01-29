// ************************************************************
// IdealWeightCalculator.java
//
// Print the area of a circle with two different radiuses
// ************************************************************
package lab02;

import java.util.Scanner;

public class IdealWeightCalculator {
    static final int BASIC_HEIGHT = 60;
    static final float RANGE = 0.15f;
    static final int FEMALE_BASIC_WEIGHT = 100;
    static final int MALE_BASIC_WEIGHT = 106;
    static final int FEMALE_ADJUSTMENT = 5;
    static final int MALE_ADJUSTMENT = 6;
    public static void main(String[] args){
        //Declare two variables to keep feet and inches of height
        int feet = 0;
        int inches = 0;
        
        //Prompt user to input feet and inches
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your height (feet):");
        feet = scanner.nextInt();
        System.out.println("Please input your height (inches):");
        inches = scanner.nextInt();
        
        //Calculate the ideal weight for female and male respectively       
        int heightInInches = feet * 12 + inches;
        float idealFemaleWeight = (heightInInches - BASIC_HEIGHT) * FEMALE_ADJUSTMENT + FEMALE_BASIC_WEIGHT;
        float idealMaleWeight = (heightInInches - BASIC_HEIGHT) * MALE_ADJUSTMENT + MALE_BASIC_WEIGHT;
        
        //print the result
        System.out.println("You are " + feet + " feet " + inches + " inches tall." );
        System.out.println("If you are a lady, your ideal weight range is from " 
                            + idealFemaleWeight*(1-RANGE) 
                            + " to " 
                            + idealFemaleWeight*(1+RANGE) + " pounds");
        System.out.println("If you are a man, your ideal weight range is from " + 
                            idealMaleWeight * (1-RANGE)
                            + " to "
                            + idealMaleWeight * (1+RANGE) + " pounds");
    }

}
