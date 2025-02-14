import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class RoundRectanglePanel extends JPanel{
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        RoundRectangle2D float_RoundRectangle = new RoundRectangle2D.Float(10, 15.5F, 100, 200, 20, 20); 
        // x and y coordinates, width, height, radius, radius at each corner
        g2d.setPaint(Color.red);
        g2d.draw(float_RoundRectangle);
        g2d.fill(float_RoundRectangle); //setting the color to fill
    }
}