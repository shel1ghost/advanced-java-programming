import javax.swing.*;
import java.awt.*;

public class DialogBox{
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame("App");
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            int selection = JOptionPane.showConfirmDialog(null, "open this app?", "App Title", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(selection == JOptionPane.OK_OPTION){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        });
    }
}
