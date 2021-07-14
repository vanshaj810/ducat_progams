import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class TestSwing implements ActionListener {
	JLabel l1,l2;
	JTextField tf;
	public TestSwing() {
		JFrame f = new JFrame("1st_App");
		l1 = new JLabel("enter ur name: ");
		l1.setBounds(40,40,120,40);
		tf = new JTextField();
		tf.setBounds(200, 40, 80, 40);
		JButton b = new JButton("Click Me");
		b.setBounds(40, 120, 100, 40);
		b.addActionListener(this);
		l2 = new JLabel();
		l2.setBounds(40,200,200,40);
		f.add(b);
		f.add(tf);
		f.add(l1);
		f.add(l2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TestSwing();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = tf.getText();
		l2.setText("ur name is: "+s);	
	}
}