import javax.swing.*;
import java.awt.*;

public class MenuBarDemo{
  public static void main(String[] args){
    EventQueue.invokeLater(()->{
      JFrame f = new JFrame("This is frame title");
      JMenuBar mb = new JMenuBar();
      JMenu m1 = new JMenu("File");
      JMenu m2 = new JMenu("Edit");
      JMenuItem mi1 = new JMenuItem("Open");
      JMenuItem mi2 = new JMenuItem("Save");
      JMenuItem mi3 = new JMenuItem("Copy");
      JMenuItem mi4 = new JMenuItem("Paste");
      m1.add(mi1);
      m1.add(mi2);
      m2.add(mi3);
      m2.add(mi4);
      mb.add(m1);
      mb.add(m2);
      f.setJMenuBar(mb);
      f.setVisible(true);
      f.setSize(300, 200);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    });
  }
}
