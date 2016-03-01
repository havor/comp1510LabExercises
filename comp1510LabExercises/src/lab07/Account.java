package lab07;

import java.util.Random;

//************************************************************
//Account.java
//
//A bank account class with methods to deposit to, withdraw from,
//change the name on, and get a String representation
//of the account.
//************************************************************
public class Account {
    private double balance;
    private String name;
    private long acctNum;
    private static Random generator = new Random();
    private static int numAccounts;

    // -------------------------------------------------
    // Constructor -- initializes balance, owner, and account number
    // -------------------------------------------------
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts++;
    }
    
    public Account (double initBal, String owner) {
        balance = initBal;
        name = owner; 
        acctNum = Math.abs(generator.nextLong());
        numAccounts++;
    }
    
    public Account (String owner){
        balance = 0;
        name = owner; 
        acctNum = Math.abs(generator.nextLong());
        numAccounts++;
    }

    // -------------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    // -------------------------------------------------
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    // -------------------------------------------------
    // Adds deposit amount to balance.
    // -------------------------------------------------
    public void deposit(double amount) {
        balance += amount;
    }

    // -------------------------------------------------
    // Returns balance.
    // -------------------------------------------------
    public double getBalance() {
        return balance;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public long getAcctNum() {
        return acctNum;
    }
    
    public void close() {
        name += " CLOSED";
        balance = 0;
        numAccounts--;
    }
    


    // -------------------------------------------------
    // Returns a string containing the name, account number, and balance.
    // -------------------------------------------------
    public String toString() {
        String extraSpace;
        extraSpace= (name.length() >7)? "" : "\t";
        return "Name:" + name + extraSpace + "\tAccount Number: " + acctNum + "\tBalance: "
                + balance;
    }
    
    public static int numAccounts() {
        return numAccounts;
    }
    
    public static Account consolidate(Account acct1, Account acct2){
        Account acct3 = null;
        if ((acct1.getName().equals(acct2.getName())) 
                && (acct1.getAcctNum() != acct2.getAcctNum())) {
           acct3 = new Account(acct1.getBalance() + acct2.getBalance(), 
                   acct1.getName()); 
           acct1.close();
           acct2.close();
        }
        return acct3;
    }
}