import javax.swing.*;
import java.awt.*;

public class UsingFontsPanel extends JPanel{
  public void paintComponent(Graphics g){
    Font f = new Font("SansSerif", Font.ITALIC, 44);
    setFont(f);
    g.setColor(Color.pink);
    g.drawString("BABI",100,100); 
  }
}

