import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class ArcPanel extends JPanel{
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        Arc2D float_Arc = new Arc2D.Float(10, 10, 200, 200, 45, 80, Arc2D.CHORD); 
        // x and y coordinates, width, height, start angle, arc angle, closure type
        g2d.draw(float_Arc);
    }
}