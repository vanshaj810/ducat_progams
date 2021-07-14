import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calc extends JFrame implements ActionListener {

	 
	JTextField tf1,tf2,tf3;
	JButton b1,b2;
	public Calc(String s) {
		super(s);
		tf1 = new JTextField();
		tf1.setBounds(40, 40, 60, 40);
		tf2 = new JTextField();
		tf2.setBounds(140, 40, 60, 40);
		tf3 = new JTextField();
		tf3.setBounds(240, 40, 60, 40);
		tf3.setEditable(false);
		b1 = new JButton("Add");
		b1.setBounds(40, 120, 80, 40);
		b1.addActionListener(this);
		b2 = new JButton("Sub");
		b2.setBounds(160, 120, 80, 40);
		b2.addActionListener(this);
		add(b1);
		add(b2);
		add(tf1);
		add(tf2);
		add(tf3);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		int c = 0 ;
		if(e.getSource() == b1)
			c = a+b;
		if(e.getActionCommand().equals("Sub"))
			c = a-b;
		tf3.setText(String.valueOf(c));
		
	}
	public static void main(String[] args) {
		new Calc("Calculater");
	}
}
