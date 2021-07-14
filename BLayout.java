import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BLayout 
{
JFrame f;
JButton b[];
BLayout(String s)
{
 f=new JFrame(s);
b=new JButton[5];
String s1[]={"north","south","east","west","center"};
String x[]={BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.EAST,BorderLayout.WEST,BorderLayout.CENTER};
for(int i=0;i<b.length;i++)
{
b[i]=new JButton(s1[i]);
f.add(b[i],x[i]);
}
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(200,200);
f.setVisible(true);
} 	
public static void main(String s[])
{
new BLayout("BorderLayout");
}
}