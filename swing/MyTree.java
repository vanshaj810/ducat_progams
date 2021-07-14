import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

class MyTree 
{
JFrame jf;
JTree jt;
JScrollPane jp;

MyTree()
{
jf=new JFrame("tree demo");
DefaultMutableTreeNode root=new DefaultMutableTreeNode("This Pc");
 

DefaultMutableTreeNode c=new DefaultMutableTreeNode("C");
DefaultMutableTreeNode d=new DefaultMutableTreeNode("D");
DefaultMutableTreeNode e=new DefaultMutableTreeNode("E");
root.add(c);
root.add(d);
root.add(e);
DefaultMutableTreeNode red=new DefaultMutableTreeNode("bea");
DefaultMutableTreeNode green=new DefaultMutableTreeNode("Intel");
DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Oracle");
DefaultMutableTreeNode b4=new DefaultMutableTreeNode("Oraclexe");
DefaultMutableTreeNode b=new DefaultMutableTreeNode("Program files");
DefaultMutableTreeNode b1=new DefaultMutableTreeNode("Program files(86)");
DefaultMutableTreeNode b2=new DefaultMutableTreeNode("User");
DefaultMutableTreeNode b3=new DefaultMutableTreeNode("Windows");
c.add(red);
c.add(green);
c.add(blue);
c.add(b4);
c.add(b);
c.add(b1);
c.add(b2);
c.add(b3);
DefaultMutableTreeNode bold=new DefaultMutableTreeNode("java");
DefaultMutableTreeNode italic=new DefaultMutableTreeNode("workspace");
DefaultMutableTreeNode un=new DefaultMutableTreeNode("project");
d.add(bold);
d.add(italic);
d.add(un);
jt=new JTree(root);
 

jp=new JScrollPane(jt);
jf.add(jp);
jf.setSize(400,400);
jf.setVisible(true);
jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE); 
}
public static void main(String d[])
{
new MyTree();
}
}





