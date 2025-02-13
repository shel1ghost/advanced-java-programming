import javax.swing.*;
import java.awt.*;

public class DrawLinePanel extends JPanel{
  public void paintComponent(Graphics g){
    g.drawLine(10,10,100,100); //x, y, width height
  }
}

