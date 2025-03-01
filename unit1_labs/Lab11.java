import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab11{
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame("Addition and Subtraction Program");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(800, 300);
            f.setVisible(true);
            Lab11Panel p = new Lab11Panel();
            f.add(p);
        });
    }
}