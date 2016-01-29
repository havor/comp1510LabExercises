package lab03;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.Timer;


public class Face extends JApplet{
    final int width = 180;
    final int height = 180;
    final int mid = width / 2;
    
    int eyeWidth = mid / 4;
    int eyeHeight = mid /  2;
    int eyeHOffset = mid / 4;
    int eyeVOffset = mid / 4;
    
    Graphics2D g2d;
    
    boolean eyesOpened = false;
    
//    public static void main(String[] args) {
//        JFrame frame =  new JFrame("A smiling face");
//        Face face = new Face();
//        frame.setSize(200, 200);
//        frame.getContentPane().add(face);
//        frame.setVisible(true);
//        int delay = 1000;
//        
//        ActionListener taskPerform = event->{
//            face.drawEyes();
//        };
//        
//        new Timer(delay, taskPerform).start();
//        
//    }
    
    public void paint(Graphics page) {
        g2d = (Graphics2D)page;
        BasicStroke thickStroke = new BasicStroke(6);         
             
        g2d.setPaint(Color.CYAN);
        g2d.fillRect(0,0,getWidth(),getHeight());
        
        //set the coordinate to middle plus 10 offset.
        g2d.translate(mid + 10, mid + 10);
           
        //fill the ears with yellow color
        g2d.setPaint(Color.ORANGE);
        g2d.fillOval(-mid, -mid, mid / 2, mid / 2);
        g2d.fillOval(mid / 2, -mid, mid / 2, mid / 2);
        
        //draw the outline of ears
        g2d.setStroke(thickStroke);
        g2d.setPaint(Color.BLACK);
        g2d.drawOval(-mid, -mid, mid / 2, mid / 2);
        g2d.drawOval(mid / 2, -mid, mid / 2, mid / 2);               
        
        //fill the face with yellow color
        g2d.setPaint(Color.YELLOW);
        g2d.fillOval(-mid, -mid, width, height);
        
        //draw the outline of face
        g2d.setStroke(thickStroke);
        g2d.setPaint(Color.BLACK);
        g2d.drawOval(-mid, -mid, width, height);
        
        //draw a nose
        g2d.setStroke(thickStroke);
        g2d.setPaint(Color.RED);
        
        g2d.drawArc(-5, 10, 5, 5, 180, 180);
        g2d.drawArc(0, 10, 5, 5, 180, 180);
        
        //draw an arc for the mouth
        int mouthWidth = width / 2;
        int mouthHeight = height /3;
         
        g2d.setPaint(Color.BLACK);
        g2d.drawArc(-mouthWidth / 2, 0, mouthWidth, mouthHeight, 210, 120);
        
        drawEyes();
        blinkEyes();        
   }
    
    private void drawOpenEyes() {
        //define line width
        BasicStroke midStroke = new BasicStroke(4);
        
        g2d.setPaint(Color.BLACK);
        //fill the eyes with black color
        
        g2d.fillOval(-(eyeHOffset + eyeWidth/2), 
                     -(eyeVOffset + eyeHeight/2), 
                    eyeWidth, 
                    eyeHeight);
        g2d.fillOval((eyeHOffset - eyeWidth/2), 
                    -(eyeVOffset + eyeHeight/2), 
                    eyeWidth, 
                    eyeHeight);
        

        

               
        //fill the pupils with white color
        g2d.setPaint(Color.WHITE);
        int pupilWidth = mid / 7;
        int pupilHeight = mid / 7;
        
        int pupilHOffset = eyeHOffset;
        int pupilVOffset = eyeVOffset + 5;
        
        g2d.fillOval(-(pupilHOffset + pupilWidth / 2), 
                    -(pupilVOffset + pupilHeight / 2), 
                    pupilWidth, 
                    pupilHeight);
        
        g2d.fillOval(pupilHOffset - pupilWidth / 2, 
                    -(pupilVOffset + pupilHeight / 2),
                    pupilWidth, 
                    pupilHeight);
    }
    
    
        //draw closed eye
        private void drawClosedEyes() {
            g2d.setPaint(Color.YELLOW);
            g2d.fillRect(-(eyeHOffset + eyeWidth / 2), 
                         -(eyeVOffset + eyeHeight / 2),
                          (eyeHOffset + eyeWidth / 2),
                          (eyeVOffset + eyeHeight / 2));
        }
        
        private void drawEyes() {
            System.out.println("working");
            if (eyesOpened){
                  drawClosedEyes();
                  System.out.println("closed!");
                  eyesOpened = false;
//                  try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
            } else{
                  drawOpenEyes();
                  eyesOpened = true;
                  System.out.println("Opened!");
//                  try {
//                      Thread.sleep(1000);
//                  } catch (InterruptedException e) {
//                      // TODO Auto-generated catch block
//                      e.printStackTrace();
//                  }
              }
        }
        
        private void blinkEyes(){
//            int delay = 1000;
//            ActionListener taskPerformer = (event)->{ 
//                drawEyes();
//
//                };     
//            new Timer(delay, taskPerformer).start();
            
            
            
            /////////////////////////////////////////////
            while(isActive()){
                if (eyesOpened) {
                    drawClosedEyes();
                    eyesOpened = false;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                } else {
                    drawOpenEyes();
                    eyesOpened = true;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
        
}
