import javax.swing.*;
import java.awt.*;

public class Arc{
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame("Arc");
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500, 500);
            ArcPanel rp = new ArcPanel();
            f.add(rp);
        });
    }
}