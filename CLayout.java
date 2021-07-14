import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CLayout implements ActionListener
{
JFrame f;
JPanel jp;
JButton b[];
CardLayout cl;
CLayout(String s)
{
jp=new JPanel();
cl=new CardLayout();
jp.setLayout(cl);	
 f=new JFrame(s);

b=new JButton[5];
String s1[]={"north","south","east","west","center"};
for(int i=0;i<b.length;i++)
{
b[i]=new JButton(s1[i]);
b[i].addActionListener(this);
jp.add(b[i]);
}
jp.setBounds(40,40,80,40);
f.add(jp);
f.setLayout(null);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
f.setSize(400,400);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
cl.next(jp);
}
public static void main(String s[])
{
new CLayout("CardLayout");
}
}