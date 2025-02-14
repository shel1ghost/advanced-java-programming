import javax.swing.*;
import java.awt.*;

public class DisplayingImages{
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame("DisplayingImages");
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500, 500);
            DisplayingImagesPanel dip = new DisplayingImagesPanel();
            f.add(dip);
        });
    }
}