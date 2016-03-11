package lab08;

import java.util.Scanner;

public class DrunkenWalk {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int timesFallOff;
        int maxSteps;
        int maxCoord;
        int drunkCounts;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many steps the drunk will walk?");
        maxSteps = scan.nextInt();
        System.out.println("What's the max coordinate of the platform for the drunk to walk?");
        maxCoord = scan.nextInt();
        System.out.println("How many drunks are to be simulated?");
        drunkCounts = scan.nextInt();
        timesFallOff =0;
        for(int i = 1; i <=drunkCounts; i++) {
            RandomWalk drunk = new RandomWalk(maxSteps, maxCoord);
            drunk.walk();
            if (!drunk.inBounds()) {
                timesFallOff ++;
                }
        } 
        
        System.out.println(drunkCounts 
                            + " drunks walked in the platform of "
                            + maxCoord 
                            + " squares in "
                            + maxSteps
                            + " steps, and "
                            + timesFallOff
                            + " of them fell off!");
        
        
        
        

    }

}
