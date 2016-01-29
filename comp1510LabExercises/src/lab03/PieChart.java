package lab03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import static java.lang.Math.PI;
import static java.lang.Math.sin;
import javax.swing.JApplet;

/**
 * Draw a pie chart to demonstrate the spending.
 * @author HAI HUA (RYAN), TAN
 * @version 1.0
 */
public class PieChart extends JApplet {


    /**
     * serialVersionUID for the class.
     */
    private static final long serialVersionUID = -3194860314403399436L;
 
    /**
     * Override the paint method to draw contents in the JApplet.
     */
    @Override
    public void paint(Graphics page) {
        final float rentAndUtilities = 0.35f;
        final float transportation = 0.15f;
        final float food = 0.15f;
        final float educational = 0.25f;
        final float miscellaneous = 0.1f;
        final int width = 400;
        final int height = 400;
        this.setSize(width, height);

        
        int beginAngle = 90;
        int drawAngle = 0;
        
        int radius = 50;
        
        page.setColor(Color.WHITE);
        page.fillRect(0, 0, getWidth(), getHeight());
        page.translate(getWidth() / 2, getHeight() / 2 );
        
        //draw a circle;

        
        //draw rentAndUtilities portion  
        //pie
        drawAngle = (int) (360 * rentAndUtilities);
        page.setColor(Color.RED);
        page.fillArc(-radius, 
                    -radius, 
                    2 * radius, 
                    2 * radius, 
                    beginAngle, 
                    drawAngle);
        //label
        //int xLabel = (int)(radius * cos((beginAngle + drawAngle / 2) * PI / 180));
        int yLabel = -(int)(radius * sin((beginAngle + drawAngle / 2) * PI / 180));
        page.fillRect(-190, yLabel, 10, 10);
        page.setColor(Color.BLACK);
        page.drawString("Rent and Utilities 35%", -170,yLabel + 10);
       // page.drawString( "Rent and Utilities",xLable-100,yLable);
        
        
        //draw transportation portion
        beginAngle += drawAngle;
        drawAngle = (int) (360 * transportation);
        page.setColor(Color.BLUE);
        page.fillArc(-radius, 
                -radius, 
                2 * radius, 
                2 * radius, 
                beginAngle, 
                drawAngle);
        yLabel = -(int)(radius * sin((beginAngle + drawAngle / 2) * PI / 180));
        page.fillRect(-190, yLabel, 10, 10);
        page.setColor(Color.BLACK);
        page.drawString("Transportation 15%", -170,yLabel + 10);
        
        
        //draw the food portion
        beginAngle += drawAngle;
        drawAngle = (int) (360 * food);
        page.setColor(Color.GREEN);
        page.fillArc(-radius, 
                    -radius, 
                    2 * radius, 
                    2 * radius, 
                    beginAngle, 
                    drawAngle);
        yLabel = -(int)(radius * sin((beginAngle + drawAngle / 2) * PI / 180));
        page.fillRect(70, yLabel, 10, 10);
        page.setColor(Color.BLACK);
        page.drawString("Food 25%", 90,yLabel + 10);
        
        
        //draw the educational portion
        beginAngle += drawAngle;
        drawAngle = (int) (360 * educational);
        page.setColor(Color.YELLOW);
        page.fillArc(-radius, 
                    -radius, 
                    2 * radius, 
                    2 * radius, 
                    beginAngle, 
                    drawAngle);
        //
        yLabel = -(int)(radius * sin((beginAngle + drawAngle / 2) * PI / 180));
        page.fillRect(70, yLabel, 10, 10);
        page.setColor(Color.BLACK);
        page.drawString("Educational 15%", 90,yLabel + 10);
        
        //draw the miscellaneous portion
        beginAngle += drawAngle;
        drawAngle = (int) (360 * miscellaneous);
        page.setColor(Color.CYAN);
        page.fillArc(-radius, 
                -radius, 
                2 * radius, 
                2 * radius, 
                beginAngle, 
                drawAngle);
        
        yLabel = -(int) (radius * sin((beginAngle + drawAngle / 2) * PI / 180));
        page.fillRect(70, yLabel, 10, 10);
        page.setColor(Color.BLACK);
        page.drawString("Miscellaneous 10%", 90,yLabel + 10);
        
        
        page.setFont(new Font("TimesRoman", Font.BOLD, 16)); 
        page.drawString("Figure 1: Household Income Spening",
                        -160,
                        -(radius + 30));
              
    }
}
