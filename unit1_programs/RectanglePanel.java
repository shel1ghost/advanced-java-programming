import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class RectanglePanel extends JPanel{
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        Rectangle2D float_rectangle = new Rectangle2D.Float(10, 15.5F, 100, 200); 
        // x and y coordinates, width, height
        g2d.setPaint(Color.blue); //setting color
        g2d.draw(float_rectangle);
    }
}