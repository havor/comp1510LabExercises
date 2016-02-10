package lab05;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//************************************************************
//VoteCounterPanel.java
//
//Demonstrates a graphical user interface and event listeners to
//tally votes for two candidates, Joe and Sam.
//************************************************************

/**
 * A container to put buttons and label for voting.
 * 
 * @author Hai Hua, Tan
 * @version 1.0
 */
public class VoteCounterPanel extends JPanel {
    /**
     * UID to solve serializing version conflict.
     */
    private static final long serialVersionUID = 8957635664263693561L;

    /**votes for Joe.*/
    private int votesForJoe;
    
    /**A button pushed to votes for Joe.*/
    private JButton joe;
    
    /**A label shows the votes for Joe.*/
    private JLabel labelJoe;
    
    
    /**votes for Sam.*/
    private int votesForSam;
    
    /**A button pushed to votes for Sam.*/
    private JButton sam;
    
    /**A label shows the votes for Sam.*/
    private JLabel labelSam;
    
    /**A button pushed to votes for Ken.*/
    private JButton ken;
    
    /**A label shows the votes for Ken.*/
    private JLabel labelKen;
    
    /**votes for Ken.*/
    private int votesForKen;
    

    /**
     * Constructor: Sets up the GUI.
     */
    public VoteCounterPanel() {
        votesForJoe = 0;
        final Dimension preferredSize = new Dimension(300, 200);
        joe = new JButton("Vote for Joe");
        sam = new JButton("Vote for Sam");
        ken = new JButton("Vote for Ken");
        joe.addActionListener(new JoeButtonListener());
        sam.addActionListener(new SamButtonListener());
        ken.addActionListener(event-> {
            votesForKen++;
            labelKen.setText("Votes for Ken: " + votesForKen);
        });
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        labelKen = new JLabel("Votes for Sam: " + votesForKen);
        add(joe);
        add(labelJoe);
        add(sam);
        add(labelSam);
        add(new JLabel("--------Ken is using Lambda Expression----------"));
        add(ken);
        add(labelKen);
        setPreferredSize(preferredSize);
        setBackground(Color.cyan);
    }

    /**
     * Represents a listener for button push (action) events.
     */
    private class JoeButtonListener implements ActionListener {
        /**
        * Updates the counter and label when Vote for Joe button is pushed.
        * @param event ActionEvent
        */
        public void actionPerformed(ActionEvent event) {
            votesForJoe++;
            labelJoe.setText("Votes for Joe: " + votesForJoe);
        }
    }
    
    /**
     * Represents a listener for button push (action) events.
     */
    private class SamButtonListener implements ActionListener {
        /**
         * Updates the counter and label when Vote for Sam button is pushed.
         * @param event ActionEvent
         */
        public void actionPerformed(ActionEvent event) {
            votesForSam++;
            labelSam.setText("Vote for Sam: " + votesForSam);
        }       
    }    
}