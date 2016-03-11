package lab08;

public class Collisions {
    public static void main(String[] args) {
        final int maxSteps = 100000;
        final int maxCoord = 2000000;
        final int startX = 3;
        int collisionCounts = 0;
        
        RandomWalk p1 = new RandomWalk(maxSteps, maxCoord, startX, 0);
        RandomWalk p2 = new RandomWalk(maxSteps, maxCoord, -startX, 0);
        
        for (int i = 1; i <= maxSteps; i++) {
           if (!p1.inBounds() || !p2.inBounds()){
               System.out.println("Partical is running out of boundary");
               break;
           } else {
               p1.takeStep();
               p2.takeStep();
//               System.out.println("p1: " + p1);
//               System.out.println("p2: s" + p2);
               if(Collisions.samePosition(p1, p2)) {
                   collisionCounts++;
               }
           }
        }
        
        System.out.println("The two particals collided " 
                            + collisionCounts 
                            + " times in last "
                            + maxSteps
                            +" runs.");
        
    }
    
    public static boolean samePosition(RandomWalk rw1, RandomWalk rw2) {
        return ((rw1.getX() == rw2.getX()) 
                && (rw1.getY() == rw2.getY()));
    }
}
