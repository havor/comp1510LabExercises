package lab09;
import java.text.NumberFormat;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String itemName;
        int itemQuantity;
        double itemPrice;
        String choice="g";
        
        System.out.println("Welcome for shopping");
        
        do {
            System.out.println("Enter the item name you want to buy:");
            itemName = scan.next();
            System.out.println("Enter the price of the item: ");
            itemPrice = scan.nextDouble();
            System.out.println("Enter the quantity you want to buy:");
            itemQuantity = scan.nextInt();
            
            shoppingCart.addToCart(itemName, itemPrice, itemQuantity);
            if (!shoppingCart.empty()){
                    System.out.println(shoppingCart.toString());
            } else {
                System.out.println("You don't get any item in your cart.");
            }
            
            System.out.println();
            System.out.println("Next...go on shopping(g), checkout(c) or quit(q)?");
            choice = scan.next();
            if (choice.equalsIgnoreCase("c")) {
                System.out.println("Please pay " + fmt.format(shoppingCart.getTotalPrice()));
            }
            if (choice.equalsIgnoreCase("q")) {
                System.out.println("Don't need anything today? ");
            }

        } while(!choice.equalsIgnoreCase("q") && !choice.equalsIgnoreCase("c"));
        System.out.println("Thank you for shopping. See you next time!");
    }
}
