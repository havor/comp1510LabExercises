package lab06;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//***********************************************************
//VoteCounterPanel.java
//
//Panel for the GUI that tallies votes for two candidates,
//Joe and Sam.
//***********************************************************


/**
 * A class extends JPanel for GUI that tallies votes for two candidates, 
 * Joe and Sam.
 * @author Hai Hua, Tan
 * @author COMP1510 instructors
 * @version 1.0
 * */
public class VoteCounterPanel extends JPanel {
    
    /**
     * A serial number for indicating object from different version.
     */
    private static final long serialVersionUID = 7200817877698357860L;
    /**Votes for Joe.*/
    private int votesForJoe;
    /**Votes for Sam.*/
    private int votesForSam;
    /**Total people that vote.*/
    private final int total = 20;
    /**A button that pushed to vote for Joe.*/
    private JButton joe;
    /**A button that pushed to vote for Sam.*/
    private JButton sam;
    /**A label showing the votes for Joe.*/
    private JLabel labelJoe;
    /**A label showing the votes for Sam.*/
    private JLabel labelSam;
    /**A label showing the voting result.*/
    private JLabel labelResult;
    /**The content of the result.*/
    private String result = "======Voting Result=======";

    /**
     * Constructor: Sets up the GUI.
     * */
    public VoteCounterPanel() {
        final Dimension preferedSize = new Dimension(300, 180);
        
        votesForJoe = 0;
        votesForSam = 0;
        joe = new JButton("Vote for Joe");
        sam = new JButton("Vote for Sam");
        VoteButtonListener listener = new VoteButtonListener();
        joe.addActionListener(listener);
        sam.addActionListener(listener);
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        labelResult = new JLabel();
        add(joe);
        add(labelJoe);
        add(sam);
        add(labelSam);
        add(labelResult);
        setPreferredSize(preferedSize);
        setBackground(Color.cyan);
    }


    /**
     * Inner class button listener to respond buttons being pushed.
     * */
    private class VoteButtonListener implements ActionListener {

        /**
         * Updates the appropriate vote counter when a
         * button is pushed for one of the candidates.
         * @param event ActionEvent emitted by buttons
         * */
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == joe) {
              votesForJoe++;
              labelJoe.setText("Votes for Joe: " + votesForJoe);  
            }
            if (event.getSource() == sam) {
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam);  
              }
            updateResult();
        }
    }
    /**
     * Method to check and update the vote result.
     * 
     */
    private void updateResult() {
         if (votesForJoe > total / 2 || votesForSam > total / 2) {
             result = "<html><body style=\"color: orange\">" 
                     + "======Vote Ended=======<br>"
                     + "Total£º " 
                     + total
                     + " people<br>"
                     + "Voted£º" 
                     + (votesForJoe + votesForSam) 
                     + " people <br>"
                     + "Final: "
                     + (votesForJoe > votesForSam ? "Joe " : "Sam ")
                     + "Wins! </body></html>";
             joe.setEnabled(false);
             sam.setEnabled(false);
         } else {
             String win = ((votesForJoe > votesForSam ? "Joe " : "Sam ") 
                     + "is leading...");
             if (votesForJoe == votesForSam) {
                 win = "Tie"; 
                 } 
             result = "<html><body style=\"color: blue\">" 
                     + "======Voting=======<br>"
                     + "Total£º " 
                     + total
                     + " people<br>"
                     + "Voted£º" 
                     + (votesForJoe + votesForSam) 
                     + " people <br>"
                     + "Current: "
                     + win
                     + "</body></html>";
             if (total == votesForJoe + votesForSam) {
                 joe.setEnabled(false);
                 sam.setEnabled(false);
             }
         }        
         
         labelResult.setText(result);
    }
}