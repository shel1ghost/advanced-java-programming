import javax.swing.*;
import java.awt.*;

public class Components{
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(800, 1000);
            f.setVisible(true);
            ComponentsPanel cp = new ComponentsPanel();
            f.add(cp);
        });
    }
}