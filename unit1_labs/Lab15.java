import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab15{
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame f = new JFrame("Addition Program");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(800, 300);
            f.setVisible(true);
            Lab15Panel p = new Lab15Panel();
            f.add(p);
        });
    }
}

class Lab15Panel extends JPanel{
    private final JLabel l1, l2, l3;
    private final JTextField t1, t2, t3;
    private final JButton btn1;
    public Lab15Panel(){
        l1 = new JLabel("Enter first number:");
        l2 = new JLabel("Enter second number:");
        l3 = new JLabel("Result:");
        t1 = new JTextField(6);
        t2 = new JTextField(6);
        t3 = new JTextField(6);
        btn1 = new JButton("Add");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn1);
        add(l3);
        add(t3);

        MyEventHandler e = new MyEventHandler();
        btn1.addMouseListener(e);
    }

    private class MyEventHandler extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
        {
            int selection = JOptionPane.showConfirmDialog(null, "Find the sum?", "Addition Program", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(selection == JOptionPane.OK_OPTION){
                int x, y, z;
			    x = Integer.parseInt(t1.getText());
			    y = Integer.parseInt(t2.getText());
			    z = x + y;
			    t3.setText(String.valueOf(z));
            }else{
                System.out.println("No");
            }
        }
    }
}