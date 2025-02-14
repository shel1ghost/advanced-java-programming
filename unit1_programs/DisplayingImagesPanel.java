import javax.swing.*;
import java.awt.*;

public class DisplayingImagesPanel extends JPanel{
  public void paintComponent(Graphics g){
    Image i = new ImageIcon("/home/babi/Pictures/shiva.jpg").getImage();
    g.drawImage(i, 10, 10, 450, 250, null);
    //image, x, y cords, width, height,, observer 
  }
}

