import javax.swing.*;
import java.awt.*;

public class RoundRectangle{
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame("RoundRectangle");
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500, 500);
            RoundRectanglePanel rp = new RoundRectanglePanel();
            f.add(rp);
        });
    }
}