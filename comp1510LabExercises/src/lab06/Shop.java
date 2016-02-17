package lab06;

//***************************************************************
//Shop.java
//
//Uses the Item class to create items and add them to a shopping
//cart stored in an ArrayList.
//***************************************************************
import java.util.ArrayList;
import java.util.Scanner;
import java.text.Format;

public class Shop {
    public static void main(String[] args) {
        //Item item;
        String itemName;
        double itemPrice;
        int quantity;
        
        ArrayList<Item> cart = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
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
            double subtotal = 0;
            for (Item item : cart) {
                subtotal += item.getPrice() * item.getQuantity();
                System.out.println(item);
            }
            System.out.println("-----------------------------");
            System.out.println("Subtotal: $" + subtotal);
            //System.out.println(cart.toString());
            System.out.print("Continue shopping (y/n)? ");
            scan.nextLine();
            keepShopping = scan.nextLine();
        } while (keepShopping.equals("y"));
        scan.close();
    }
}
