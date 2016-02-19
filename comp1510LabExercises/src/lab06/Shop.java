package lab06;

import java.text.NumberFormat;
//***************************************************************
//Shop.java
//
//Uses the Item class to create items and add them to a shopping
//cart stored in an ArrayList.
//***************************************************************
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class simulate shopping to test the Item class.
 * @author Hai Hua, Tan
 * @author COMP1510 Lab instructors.
 * @version 1.0
 * */
public class Shop {
    /**
     * Main entry of the program. Invoked by JVM.
     * @param args the command line parameter lists. Unused.
     * */
    public static void main(String[] args) {
        //Item item;
        String itemName;
        double itemPrice;
        int quantity;
        
        ArrayList<Item> cart = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String keepShopping = "y";
        
        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            cart.add(new Item(itemName, itemPrice, quantity));
            
            // *** print the contents of the cart object using println
            System.out.println("**************************************");
            double subtotal = 0;
            for (Item item : cart) {
                subtotal += item.getPrice() * item.getQuantity();
                System.out.println(item);
            }
            System.out.println("-----------------------------");
            System.out.println("Subtotal: \t\t" + fmt.format(subtotal));
            //System.out.println(cart.toString());
            System.out.println("**************************************");
            System.out.print("Continue shopping (y/n)? ");
            scan.nextLine();
            keepShopping = scan.nextLine();
        } while (!keepShopping.equals("n"));
        scan.close();
    }
}
