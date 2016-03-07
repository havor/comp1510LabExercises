package lab07;

//************************************************************
//TestAccounts1
//A simple program to test the numAccts method of the
//Account class.
//************************************************************
import java.util.Scanner;

public class TestAccounts1 {
    public static void main(String[] args) {
        TestAccounts1 test = new TestAccounts1();
        Account testAcct;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            testAcct = new Account(100, "Name" + i);
            System.out.println("\nCreated account:\n" + testAcct);
            System.out.println("Now there are " 
            + Account.numAccounts() 
            + " accounts");
        }
        
        System.out.println();
        System.out.println("======Close and consolidate accounts tests======");
        String name1;
        String name2;
        String name3;
        String sameAcctNum;
        Account account1;
        Account account2;
        Account account3;
        String toContinue = "y";
        mainloop:
        do {
            name1 = test.inputName(scan,"name1");
            if (name1.equalsIgnoreCase("q")) break;
            name2 = test.inputName(scan,"name2");
            if (name2.equalsIgnoreCase("q")) break;
            name3 = test.inputName(scan, "name3");
            if (name3.equalsIgnoreCase("q")) break;
            
            System.out.println("Account 2 and 3 with same acccount number? (y/n)");
            sameAcctNum = scan.next();
            account1 = new Account(100, name1);
            
            if(sameAcctNum.equalsIgnoreCase("y")) {
                account2 = new Account(100, name2, 10000000L);
                account3 = new Account(100, name3, 10000000L);
            } else {
                account2 = new Account(100, name2);
                account3 = new Account(100, name3);
            }
            
            System.out.println("Three account created:");
            System.out.println(account1);
            System.out.println(account2);
            System.out.println(account3);
            System.out.println("Now there are " 
            + Account.numAccounts() + " accounts");
            
            System.out.println();
            System.out.println("Trying to close Account1:");
            account1.close();
            System.out.println(account1);
            System.out.println("Now there are " 
            + Account.numAccounts() + " accounts");
            
            System.out.println();
            System.out.println("Try to consolidate account2 and account3");
            test.testConsolidateAccount(account2, account3);
            
            System.out.println();
            System.out.println("Try again? type \"n\" to quit.");
            toContinue = scan.next();
        }while (!toContinue.equalsIgnoreCase( "n"));
        

    }
    
    public void testConsolidateAccount(Account acct1,
                                        Account acct2) {
        System.out.println("***Before consolidation***");
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println("Now there are " 
                + Account.numAccounts() 
                + " accounts");
        
        System.out.println();
        Account acct3 = Account.consolidate(acct1, acct2);
        
        System.out.println("***After consolidation***");
        System.out.println(acct1);
        System.out.println(acct2);
        if (acct3 != null) {
            System.out.println(acct3);
        } else {
            System.out.println("The acounts can not be consolidated!");
        }
        System.out.println("Now there are " 
                + Account.numAccounts() 
                + " accounts");
    } 
    
    public String inputName(Scanner scan, String string){
        String name;
        do {
            System.out.println("Please enter " + string + ": (\"q\" to quit)");
            name = scan.next();
        } while(name.isEmpty());
        return name;
    }
}