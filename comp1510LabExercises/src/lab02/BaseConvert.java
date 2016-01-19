package lab02;

import java.util.Scanner;

public class BaseConvert {

    
    public static void main(String[] args){
        int base =10;
        int base10Number = 0;
        int maxNumber =1;
        
        int place0;
        int place1;
        int place2;
        int place3;
        String baseBNum = new String("");
        Scanner scanner = new Scanner(System.in);
        
     // read in the base 10 number and the base
        System.out.println();
        System.out.println ("Base Conversion Program");
        System.out.println() ;
        System.out.print ("Please enter a base (2-9): ");
        base = scanner.nextInt();
        
        //calculate the maxNumber
        for(int i = 1; i<=4; i++){
            maxNumber*=base;
        }
        maxNumber-=1;
        
        //Input a base 10 number
        do{
            System.out.print("please input a 10 base number:");
            base10Number = scanner.nextInt();
            if(base10Number > maxNumber) System.out.println("The number is out of range.");
        }while(base10Number > maxNumber);
        
        //convert calculate
        int temp = base10Number;
        place0 = temp % base;
        temp /= base;
        place1 = temp % base;
        temp /= base;
        place2 = temp % base;
        temp /= base;
        place3 = temp % base;
        
        //concatenate all places to a string
        baseBNum = baseBNum + place3 + place2 + place1 + place0;
        
        //print the result
        System.out.println("(" + base10Number + ")10 =" + "(" + baseBNum + ")" + base );
        

        
    }
    
    

    
    
    
    

}
