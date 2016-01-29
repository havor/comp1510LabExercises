package lab03;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Colors extends JApplet{
    public void paint(Graphics page) {
        //Declare size constants
        final int PAGE_WIDTH = 600;
        final int PAGE_HEIGHT = 400;
        
        final int LINE_WIDTH = 30;
        final int INDENT = 70;
        
        final int MAX_COLOR = 255;
        
        setSize(PAGE_WIDTH, PAGE_HEIGHT);
        
        //Declare variables
        int x, y;
        int width, height;
        
        Color myColor  = new Color(2486921);
        //Set the background color and paint the screen with a white rectangle
        setBackground(Color.white);
        page.setColor(Color.white);
        page.fillRect(0, 0, PAGE_WIDTH, PAGE_HEIGHT);
        
        //Set the color for the rectangle
        page.setColor(myColor);
        
        //Assign the corner point and width and height and then draw
        x = 200;
        y = 125;
        width = 200;
        height = 150;
        
        page.fillRect(x, y, width, height);
        
        int redCode = myColor.getRed();
        int greenCode = myColor.getGreen();
        int blueCode = myColor.getBlue();
        
        x += INDENT;
        y += LINE_WIDTH;
        
        Color stringColor = new Color(MAX_COLOR - myColor.getRed(),
                                      MAX_COLOR - myColor.getGreen(),
                                      MAX_COLOR - myColor.getBlue());
        page.setColor(stringColor);
        page.drawString("Red: " + redCode, x, y);
        
        y += LINE_WIDTH;
        page.drawString("Green: " + greenCode, x, y);
        
        y += LINE_WIDTH;
        page.drawString("Blue: " + blueCode, x, y);
    }

}
