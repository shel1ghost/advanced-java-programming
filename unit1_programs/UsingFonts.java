import javax.swing.*;
import java.awt.*;

public class UsingFonts{
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame("UsingFonts");
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500, 500);
            UsingFontsPanel rp = new UsingFontsPanel();
            f.add(rp);
        });
    }
}