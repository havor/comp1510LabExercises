package lab08;
import java.util.Scanner;

public class Comparisons {
    public static void main(String[] args) {
        
        String valString1;
        String valString2;
        String valString3;
        
        int valInt1;
        int valInt2;
        int valInt3;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=====Test compare3 with 3 strings===");
        System.out.println("Please input 3 string, first one: ");
        valString1 = scan.next();
        
        System.out.println("Please input 3 string, second one: ");
        valString2 = scan.next();
        
        System.out.println("Please input 3 string, last one: ");
        valString3 = scan.next();
                
        System.out.println("The largest string among \"" 
                            + valString1 +"\", \"" 
                            + valString2 +"\" and \"" 
                            + valString3 
                            + "\" is: " 
                            + Compare3.largest(valString1, valString2, valString3));
        
        System.out.println();
        
        System.out.println("=====Test compare3 with 3 integers===");
        System.out.println("Please input 3 integers, first one: ");
        valInt1 = scan.nextInt();
        
        System.out.println("Please input 3 integers, second one: ");
        valInt2 = scan.nextInt();
        
        System.out.println("Please input 3 integers, last one: ");
        valInt3 = scan.nextInt();
        System.out.println("The largest integer among " 
                           + valInt1
                           + ", "
                           + valInt2
                           + " and "
                           + valInt3
                           + " is: "
                           + Compare3.largest(valInt1, valInt2, valInt3));        
        scan.close();
    }    
}
