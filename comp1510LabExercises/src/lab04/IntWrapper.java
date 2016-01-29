package lab04;

import java.util.Scanner;

/**
 * Use primitive Wrapper class to manipulate data.
 * @author Haihua (Ryan), Tan
 * @version 1.0
 * */
public class IntWrapper {
    /**
     * Main entry of the program.
     * @param args is unused.
     * */
    public static void main(String[] args) {
        int intVal;
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter a number: ");
        intVal = scan.nextInt();
        //Integer integer = new Integer(intVal);
        System.out.println("================Base convertion==============");
        System.out.println("(" + intVal 
                            + ")10 = ("
                            + Integer.toBinaryString(intVal)
                            + ")2 = ("
                            + Integer.toOctalString(intVal)
                            + ")8 = ("
                            + Integer.toHexString(intVal)
                            + ")16");
        System.out.println();
        
        System.out.println("==========Maximun and minimum integer=========");
        System.out.println("The maximun integer in java is: " 
                            + Integer.MAX_VALUE);
        
        System.out.println("The minimum integer in java is: " 
                            + Integer.MIN_VALUE);
        System.out.println();
        
        String intString1;
        String intString2;
           
        System.out.println("==========Conver strings to integer============");
        System.out.print("Please enter another two number, first one: ");
        intString1 = scan.next();
        System.out.print("The second one: ");
        intString2 = scan.next();
        
        int int1 = Integer.parseInt(intString1);
        int int2 = Integer.parseInt(intString2);
        
        System.out.println(intString1 
                          + " + " 
                          + intString2
                          + " = "
                          + (int1 + int2)
                          );
        
        scan.close();
        
        
    }
}
