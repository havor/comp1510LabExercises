package lab09;

//************************************************************
//TelephonePanel.java
//
//Lays out a (functionless) GUI like a telephone keypad with a title.
//Illustrates use of BorderLayout and GridLayout.
//************************************************************
import java.awt.*;
import javax.swing.*;
public class TelephonePanel extends JPanel
{
public TelephonePanel()
{
//set BorderLayout for this panel
    setLayout(new BorderLayout());
    
//create a JLabel with "Your Telephone" title
    JLabel title = new JLabel("Your Telephone");
    
//add title label to north of this panel
    JPanel titlePane = new JPanel();
    titlePane.add(title);
    add(titlePane, BorderLayout.NORTH);
//create panel to hold keypad and give it a 4x3 GridLayout
    JPanel keyPane = new JPanel();
    keyPane.setLayout(new GridLayout(4,3, 5,5));
    
    
//add buttons representing keys to key panel
   
    keyPane.add(new JButton("1"));
    keyPane.add(new JButton("2"));
    keyPane.add(new JButton("3"));
    keyPane.add(new JButton("4"));
    keyPane.add(new JButton("5"));
    keyPane.add(new JButton("6"));
    keyPane.add(new JButton("7"));
    keyPane.add(new JButton("8"));
    keyPane.add(new JButton("9"));
    keyPane.add(new JButton("*"));
    keyPane.add(new JButton("0"));
    keyPane.add(new JButton("#"));

      
//add key panel to center of this panel
    add(keyPane, BorderLayout.CENTER);
}
}