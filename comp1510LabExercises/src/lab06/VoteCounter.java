package lab06;

//************************************************************
//VoteCounter.java
//
//Demonstrates a graphical user interface and event
//listeners to tally votes for two candidates, Joe and Sam.
//************************************************************
import javax.swing.JFrame;

/**
 * A class demonstrates a graphical user interface and event
 * listeners to tally votes for two candidates, Joe and Sam.
 * @author Hai Hua, Tan
 * @author COMP1510 Lab instructors.
 * @version 1.0
 * */
public class VoteCounter {
    // -----------------------------------------
    // Creates the main program frame.
    // -----------------------------------------
    /**
     * Main entry of the program, invoked by JVM.
     * @param args command line parameter lists. Unused.
     * */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VoteCounterPanel());
        frame.pack();
        frame.setVisible(true);
    }
}