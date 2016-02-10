package lab05;

//************************************************************
//VoteCounter.java
//
//Demonstrates a graphical user interface and event listeners to
//tally votes for two candidates, Joe and Sam.
//************************************************************
import javax.swing.JFrame;

/**
 * Main window to run the vote counter.
 * @author Hai Hua, Tan
 * @version 1.0
 */
public class VoteCounter {
//--------------------------------------------
//Creates the main program frame.
//--------------------------------------------

/**
 * Main entry of the program.
 * @param args is command line parameters, unused.
 */
public static void main(String[] args) {
JFrame frame = new JFrame("Vote Counter");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new VoteCounterPanel());
frame.pack();
frame.setVisible(true);
}
}