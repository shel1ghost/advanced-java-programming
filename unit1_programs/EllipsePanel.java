import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class EllipsePanel extends JPanel{
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        Ellipse2D float_Ellipse = new Ellipse2D.Float(10, 15.5F, 100, 200); 
        // x and y coordinates, width, height
        g2d.draw(float_Ellipse);
    }
}