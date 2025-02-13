import javax.swing.*;
import java.awt.*;

public class DrawLine{
  public static void main(String[] args){
    EventQueue.invokeLater(()->{
      JFrame f = new JFrame("This is frame title");
      f.setVisible(true);
      f.setSize(300, 200);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      DrawLinePanel p = new DrawLinePanel();
      f.add(p);
    });
  }
}

