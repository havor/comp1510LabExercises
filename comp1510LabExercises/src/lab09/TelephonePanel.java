package lab09;

//************************************************************
//TelephonePanel.java
//
//Lays out a (functionless) GUI like a telephone keypad with a title.
//Illustrates use of BorderLayout and GridLayout.
//************************************************************
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class TelephonePanel extends JPanel
{
    String dialedNumber;
    static final int maxNumLength = 18;
    JLabel title;
    PhoneButton dialButton;
    PhoneButton hangButton;
    PhoneButton delButton;
public TelephonePanel() {   
    dialedNumber = "";
//set BorderLayout for this panel
    setLayout(new BorderLayout());
    
//create a JLabel with "Your Telephone" title
    title = new JLabel("Your Telephone");
    
//add title label to north of this panel
    JPanel titlePane = new JPanel();
    titlePane.add(title);
    add(titlePane, BorderLayout.NORTH);
//create panel to hold keypad and give it a 4x3 GridLayout
    JPanel keyPane = new JPanel();
    keyPane.setLayout(new GridLayout(4,3, 5,5));
    
    
//add buttons representing keys to key panel
    for (int i =1; i <= 9; i++){
      keyPane.add(new PhoneButton(new Integer(i).toString()));  
    }
    
//    keyPane.add(new JButton("2"));
//    keyPane.add(new JButton("3"));
//    keyPane.add(new JButton("4"));
//    keyPane.add(new JButton("5"));
//    keyPane.add(new JButton("6"));
//    keyPane.add(new JButton("7"));
//    keyPane.add(new JButton("8"));
//    keyPane.add(new JButton("9"));
    keyPane.add(new PhoneButton("*"));
    keyPane.add(new PhoneButton("0"));
    keyPane.add(new PhoneButton("#"));

      
//add key panel to center of this panel
    add(keyPane, BorderLayout.CENTER);
    
    JPanel controlPane = new JPanel();
    controlPane.setLayout(new GridLayout(1,3,5,10));
    dialButton = new PhoneButton("Dial");
    controlPane.add(dialButton);
    
    hangButton = new PhoneButton("Hang");
    controlPane.add(hangButton);
    
    delButton = new PhoneButton("Del");
    controlPane.add(delButton);
    
    add(controlPane, BorderLayout.SOUTH);
}

class PhoneButton extends JButton {
    PhoneButton(String number){
        super(number);
        this.addActionListener(new DialListener());
    }
    
    class DialListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        String keyContent = ((JButton)event.getSource()).getText();
        switch (keyContent){
        case "Dial":
            if(dialedNumber.length() >0 && !dialedNumber.equals(" ")) {
              title.setText(dialedNumber + " ...");  
              delButton.setEnabled(false);
            }            
            break;
        case "Hang":
            dialedNumber = "";
            title.setText(" ");
            delButton.setEnabled(true);
            break;
        case "Del":
            int length = dialedNumber.length();
            if (length >0) {
                dialedNumber = dialedNumber.substring(0, length-1);
            } 
            if (dialedNumber.length() == 0){
                dialedNumber = " ";
            }
            
            title.setText(dialedNumber);
            break;
        default:            
            if (dialedNumber.length() < maxNumLength)
                dialedNumber += ((JButton)event.getSource()).getText();
                title.setText(dialedNumber);
            break;    
            }   
        }
    } 
}
}