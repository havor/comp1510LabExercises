package lab05;
import java.util.Scanner;
/**
 * A class to test the Name class. Prompt user to enter first name,
 * middle name and last name to create two Name objects; Construct
 * the Name objects, read the info 
 * of names in different forms;Compare two Name objects are equal or not.
 * @author Hai Hua, Tan
 * @version 1.0
 * */
public class TestNames {
    /**
     *Main entry of the program.
     *@param args are command line running arguments, unused.  
     */
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;
        Scanner scan = new Scanner(System.in);
        
        //Prompt user to enter the name of first person
        System.out.println("Please enter the name of the first person.");
        System.out.print("Fisrt Name: ");
        firstName = scan.next();
        System.out.print("Middle Name: ");
        middleName = scan.next();
        System.out.print("Last Name: ");
        lastName = scan.next();
        
        Name name1 = new Name(firstName, middleName, lastName);
        
      //Prompt user to enter the name of second person
        System.out.println("Please enter the name of the second person.");
        System.out.print("Fisrt Name: ");
        firstName = scan.next();
        System.out.print("Middle Name: ");
        middleName = scan.next();
        System.out.print("Last Name: ");
        lastName = scan.next();
        
        Name name2 = new Name(firstName, middleName, lastName);
        
        System.out.println();
        
        System.out.format("%-8s%-25s%-25s%-15s%-8s\n", 
                            "Name",
                            "Full Name",
                            "Full Name(R)",
                            "Ininitials",
                            "Length");
        System.out.format("%-8s%-25s%-25s%-15s%-8s\n", 
                "--------",
                "-------------------------",
                "-------------------------",
                "---------------",
                "--------");
        
        System.out.format("%-8s%-25s%-25s%-15s%-8d\n", 
                "name1",
                name1.getFirstMiddleLast(),
                name1.getLastFirstMiddle(),
                name1.getInitials(),
                name1.length());
        System.out.format("%-8s%-25s%-25s%-15s%-8d\n", 
                "name2",
                name2.getFirstMiddleLast(),
                name2.getLastFirstMiddle(),
                name2.getInitials(),
                name2.length());
        System.out.format("%-8s%-25s%-25s%-15s%-8s\n", 
                "--------",
                "-------------------------",
                "-------------------------",
                "---------------",
                "--------");
        System.out.print("The two names are ");
        if (name1.equals(name2)) {
            System.out.println("the same!");
        } else {
            System.out.println("different.");
        }
        scan.close();
    }

}
