import javax.swing.*;    
import java.awt.event.*;  
public class PFEx 
{  
    public static void main(String[] args) 
	{    
		ImageIcon i = new ImageIcon("ii.jpg"); 		
		JFrame f=new JFrame("Login Page"); 
		JLabel l = new JLabel(); 		
		l.setBounds(20,150, 300,50);
		JLabel l1=new JLabel("User Name:");    
        l1.setBounds(20,20, 80,30);
		final JTextField tf = new JTextField();  
        tf.setBounds(100,20, 100,30);
		JLabel l2=new JLabel("Password:");    
        l2.setBounds(20,75, 80,30);  		
		final JPasswordField pf = new JPasswordField();   
		pf.setBounds(100,75,100,30);            
        JButton b = new JButton(i);  
        b.setBounds(100,120, 80,30);    
        f.add(pf);
		f.add(l1);
		f.add(l);
		f.add(l2);
		f.add(b);
		f.add(tf);  
        f.setSize(300,300);    
        f.setLayout(null);    
        f.setVisible(true);  
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() 
		{  
			public void actionPerformed(ActionEvent e) 
			{       
                String s = "Username: " + tf.getText();  
                s = s + ", Password: "+ pf.getPassword();   
                l.setText(s);          
            }  
        });   
}  
} 