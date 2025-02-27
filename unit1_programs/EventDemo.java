import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventDemo
{
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(() -> {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(600,200);
            SimplePanel p = new SimplePanel();
            f.add(p);
            f.setVisible(true);
        });
    }    
}
class SimplePanel extends JPanel
{
    private final JButton b1, b2;
    private final JTextField t1, t2, t3;
	private final JLabel l1, l2, l3;
	private final JCheckBox cb;
    public SimplePanel()
    {        
        t1 = new JTextField(8);
		t2 = new JTextField(8);
		t3 = new JTextField(8);
		b1 = new JButton("Add");
		b2 = new JButton("Subtract");
		l1 = new JLabel("Val1:");
		l2 = new JLabel("Val2:");
		l3 = new JLabel("Result:");
		cb = new JCheckBox("Check here");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(l3);
		add(t3);
		add(cb);
        MyEventHandler e = new MyEventHandler();
		b1.addActionListener(e);
		b2.addActionListener(e);        
    }  
    private class MyEventHandler implements ActionListener
    {
		public void actionPerformed(ActionEvent ae)
		{
			if(cb.isSelected())
			{
				int x, y, z;
				x = Integer.parseInt(t1.getText());
				y = Integer.parseInt(t2.getText());
				if(ae.getActionCommand() == "Add")
					z = x + y;
				else
					z = x - y;
				t3.setText(String.valueOf(z));
			}
			
		}
    }
}
