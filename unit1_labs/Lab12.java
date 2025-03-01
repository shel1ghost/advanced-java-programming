import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab12{
    public static void main(String[]args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(600, 500);
            f.setVisible(true);
            Lab12Panel panel = new Lab12Panel();
            f.add(panel);
        });
    }
}