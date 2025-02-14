import javax.swing.*;
import java.awt.*;

public class Ellipse{
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame("Ellipse");
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500, 500);
            EllipsePanel rp = new EllipsePanel();
            f.add(rp);
        });
    }
}