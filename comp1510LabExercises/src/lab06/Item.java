package lab06;

// ***************************************************************
//Item.java
//
//Represents an item in a shopping cart.
//***************************************************************
import java.text.NumberFormat;
/**A class represents an item in a shopping cart.
 * @author Hai Hua, Tan
 * @author COMP1510 Lab assignment designer
 * @version 1.0
 * */
public class Item {
    /**Item name.*/
    private String name;
    /**Item price.*/
    private double price;
    /**Item quantity.*/
    private int quantity;

    /**
     * ---------------------------------------------------- -- Create a new item
     * with the given attributes.
     * 
     * @param itemName
     *            name of the item.
     * @param itemPrice
     *            price of the item.
     * @param numPurchased
     *            the quantities of the item.
     */
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }

    /**
     * Return a string with the information about the item.
     * @return the String with object descript.
     */

    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name 
                + "\t" 
                + fmt.format(price) 
                + "\t" 
                + quantity 
                + "\t" 
                + fmt.format(price * quantity));
    }


    /**
     * Getter of the price.
     * @return the unit
     * */
    public double getPrice() {
        return price;
    }

    /**
     * Getter of the name.
     * @return the name of the item
     * */
    public String getName() {
        return name;
    }

    /**
     * Getter of the quantity.
     * @return the quantity of the item in the cart
     * */
    public int getQuantity() {
        return quantity;
    }
}
