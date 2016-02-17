package lab06;

// ***************************************************************
//Item.java
//
//Represents an item in a shopping cart.
//***************************************************************
import java.text.NumberFormat;

public class Item {
    private String name;
    private double price;
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
     * Return a string with the information about the item
     * 
     * @return the String with object descript.
     */

    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t" + fmt.format(price * quantity));
    }

    // -----------------------------------------------
    // Returns the unit price of the item
    // -----------------------------------------------
    public double getPrice() {
        return price;
    }

    // -----------------------------------------------
    // Returns the name of the item
    // -----------------------------------------------
    public String getName() {
        return name;
    }

    // -----------------------------------------------
    // Returns the quantity of the item
    // -----------------------------------------------
    public int getQuantity() {
        return quantity;
    }
}
