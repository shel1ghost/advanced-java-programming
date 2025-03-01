import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab11Panel extends JPanel{
    private final JLabel l1, l2, l3;
    private final JTextField t1, t2, t3;
    private final JButton btn1, btn2;
    public Lab11Panel(){
        l1 = new JLabel("Enter first number:");
        l2 = new JLabel("Enter second number:");
        l3 = new JLabel("Result:");
        t1 = new JTextField(6);
        t2 = new JTextField(6);
        t3 = new JTextField(6);
        btn1 = new JButton("Add");
        btn2 = new JButton("Subtract");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn1);
        add(btn2);
        add(l3);
        add(t3);

        MyEventHandler e = new MyEventHandler();
        btn1.addActionListener(e);
        btn2.addActionListener(e);
    }

    private class MyEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
			int x, y, z;
			x = Integer.parseInt(t1.getText());
			y = Integer.parseInt(t2.getText());
			if(e.getActionCommand()=="Add")
				z = x + y;
			else
				z = x - y;
			t3.setText(String.valueOf(z));
        }
    }
}