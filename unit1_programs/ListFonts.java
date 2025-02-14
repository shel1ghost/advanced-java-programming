import javax.swing.*;
import java.awt.*;

public class ListFonts{
    public static void main(String[] args){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();
        for(String f : fontNames){
            System.out.println(f);
        }
    }
}