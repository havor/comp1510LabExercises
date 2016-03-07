package lab08;
import java.util.Scanner;

public class Comparisons {
    public static void main(String[] args) {
        Compare3 val1;
        Compare3 val2;
        Compare3 val3;
        
        String valString;
        int intVal;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input 3 string, first one: ");
        valString = scan.next();
        val1 = new Compare3(valString);
        
        System.out.println("Please input 3 string, second one: ");
        valString = scan.next();
        val2 = new Compare3(valString);
        
        System.out.println("Please input 3 string, last one: ");
        valString = scan.next();
        val3 = new Compare3(valString);
        
        System.out.println("Three Compare3 objects:");
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        
        System.out.println(Compare3.largest(val1, val2, val3));
        
        scan.close();
    }
    
    private void inputStrings(Scanner scan){
        
    }

}
