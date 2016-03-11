package lab08;

//************************************************************
//TestWalk.java
//
//Program to test methods in the RandomWalk class.
//************************************************************
import java.util.Scanner;

public class TestWalk {
    public static void main(String[] args) {
        int maxSteps; // maximum number of steps in a walk
        int maxCoord; // the maximum x and y coordinate
        int x, y; // starting x and y coordinates for a walk
        Scanner scan = new Scanner(System.in);
      
        System.out.println("\nRandom Walk Test Program");
        System.out.println();
        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        System.out.print("Enter the starting x and y coordinates with "
                + "a space between: ");
        x = scan.nextInt();
        y = scan.nextInt();
        
        RandomWalk rw1 = new RandomWalk(200, 10);
        RandomWalk rw2 = new RandomWalk(maxSteps, maxCoord, x, y);
        System.out.println("========initial==================");
        System.out.println("rw1: " + rw1);
        System.out.println("rw2: " + rw2);
        System.out.println();
        
        System.out.println("========rw1 walks by itself=========================");
        rw1.walk();
        
        System.out.println();
        System.out.println("========rw2 Walk 5 steps, find maximun distance of the walk=============");
        System.out.println("rw2: " + rw2 + ", max distance:" + rw2.getMaxDistance()); 
        for (int i = 0; i < 5; i++) {
            if(rw2.inBounds() && rw2.moreSteps()) {
                rw2.takeStep();
            }
            
            //System.out.println("rw1: " + rw1 + ", max distance:" + rw1.getMaxDistance());
            System.out.println("rw2: " + rw2 + ", max distance:" + rw2.getMaxDistance());   
        }    
        
        
//        RandomWalk rw = new RandomWalk(200, 10);
//        rw.walk();
    }
}
