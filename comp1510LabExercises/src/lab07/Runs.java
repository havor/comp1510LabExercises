package lab07;

import java.util.ArrayList;

//******************************************************************
//Runs.java
//
//Finds the length of the longest run of heads in 100 flips of a coin.
//*******************************************************************
public class Runs {
    public static void main(String[] args) {
        final int flips = 100; // number of coin flips
        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0; // length of the maximum run so far
        //int maxRunEnd = 0;
        // Create a coin object
        Coin coin = new Coin();
        ArrayList<Integer> maxRunEnds = new ArrayList<>();
        // Flip the coin FLIPS times
        for (int i = 0; i < flips; i++) {
            // Flip the coin & print the result
            // Update the run information
            coin.flip();
            System.out.print("Result of flip " + (i + 1) + " is :");
            System.out.println(coin);
            
            if (coin.isHeads()) {
                currentRun++;
                if (currentRun == maxRun) {
                    maxRunEnds.add(i);
                }
                if (currentRun > maxRun) {
                    maxRun = currentRun;
                    maxRunEnds.clear();
                    maxRunEnds.add(i);
                    //maxRunEnd =i;
                }
            } else {
                currentRun = 0;
            }
        }
        // Print the results
        
        System.out.println();
        
        String result = (maxRunEnds.size()>1)?("They happened: "):("It happened:");
        System.out.println("The max run of heads in the last 100 flips is " + maxRun + ". " + result);
        
        for(int i : maxRunEnds){
        System.out.println("From flip " + (i - maxRun + 2) + " to flip " + (i + 1));
        }
    }
}