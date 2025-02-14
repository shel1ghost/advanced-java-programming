import javax.swing.*;
import java.awt.*;

public class GeneralPaths{
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame("GeneralPaths");
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500, 500);
            GeneralPathsPanel rp = new GeneralPathsPanel();
            f.add(rp);
        });
    }
}