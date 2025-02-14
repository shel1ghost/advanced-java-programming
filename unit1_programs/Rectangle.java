import javax.swing.*;
import java.awt.*;

public class Rectangle{
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame("Rectangle");
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500, 500);
            RectanglePanel rp = new RectanglePanel();
            f.add(rp);
        });
    }
}