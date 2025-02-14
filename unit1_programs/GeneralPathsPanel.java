import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GeneralPathsPanel extends JPanel{
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        Rectangle2D float_Rect = new Rectangle2D.Float(10, 15.5F, 100, 200); 
        // x and y coordinates, width, height, radius, radius at each corner
        //g2d.draw(float_GeneralPaths);

        GeneralPath path = new GeneralPath();
        path.moveTo(10, 20);
        path.lineTo(50, 10);
        path.lineTo(100, 50);
        path.append(float_Rect, true);
        path.closePath();
        g2d.draw(path);
        
    }
}