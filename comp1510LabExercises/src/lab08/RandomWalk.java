package lab08;

import java.util.Random;

/**
 *A class that models a random walk in a limited area.
 *@author Hai Hua, Tan
 *@version 1.0 
 */
public class RandomWalk {
    /**Current coordinate x.*/
    private int startX;
    /**Current coordinate y.*/
    private int startY;

    /**Current coordinate x.*/
    private int x;
    /**Current coordinate y.*/
    private int y;
    /**Max steps the object can walk.*/
    private int maxSteps;
    /**Current steps the object walks.*/
    private int currentSteps;
    /**Boundary of the walking area.*/
    private int edge;
    /**max distance the object walks.*/
    private int maxDistance;
    
    /**
     *Constructor with given max steps and boundaries.
     *@param maxSteps The max steps the RandomWalk object can run.
     *@param edge The number representing the boundary.
     */
    RandomWalk(int maxSteps, int edge) {
        x = 0;
        y = 0;
        startX = 0;
        startY = 0;
        currentSteps = 0;
        this.maxSteps = maxSteps;
        this.edge = edge;
        maxDistance = 0;
    }
    
    /**
     * Constructor with give max steps, boundary, and starting coordinate.
     * @param maxSteps The maximum number of steps that RandomWalk object can walk.
     * @param edge The number representing the boundary of the walking area.
     * @startX x coordinate of the RandomWalk class.
     *   
     */
    RandomWalk(int maxSteps, int edge, int startX, int startY) {
        x = startX;
        y = startY;
        this.startX = x;
        this.startY = y;
        currentSteps = 0;
        this.maxSteps = maxSteps;
        this.edge = edge;
        maxDistance = 0;
    }
    /**
     * Method to get description of the RandomWalk object
     */
    public String toString() {
        
        
        return ("currentSteps: " 
                + currentSteps 
                + ", position: ("
                + x 
                + ", "
                + y
                + ")");
    }
    
    /**
     * Method 
     */
    public void takeStep() {
        Random rand = new Random();
        final int up = 0;
        final int right = 1;
        final int down = 2;
        final int left = 3;
        final int maxNumOfDirection = 4;
        
        int direction = rand.nextInt(maxNumOfDirection);
        switch (direction) {
        case up:
            y++;
            break;
        case right:
            x++;
            break;
        case down:
            y--;
            break;
        case left: 
            x--;
            break;
        default:
            break;
        }
        currentSteps++;
        int currentDistance = (int) Math.round(
                  Math.sqrt(Math.pow((x - startX), 2)) 
                + Math.sqrt(Math.pow((y - startY), 2)));
        maxDistance = max(maxDistance, currentDistance);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    /**
     * Method to test whether current steps reach max steps.
     * @return true if current steps is less than maximum steps
     */
    public boolean moreSteps() {
        return (currentSteps < maxSteps);
    }
    
    /**
     * Method to test whether the object is inside the square of walking area.
     * @return true if the object is inside the square of walking area.
     */
    public boolean inBounds() {
        return (x >= -edge && x <= edge && y >= -edge && y <= edge);
    }
    
    /**
     * Method to simulate the random walk.
     *  
     */
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
            System.out.println(toString());
            if (!inBounds())
                System.out.println("End: Out of boundary!");
            if(!moreSteps()) 
                System.out.println("End: Maximum steps reached.");
        }
    }
    
    private int max(int num1, int num2) {
        return (num1 > num2) ? num1: num2;
    }
    
    public int getMaxDistance() {
        return maxDistance;
    }
    
    
}
