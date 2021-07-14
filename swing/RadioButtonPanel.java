import javax.swing.*;
import java.awt.*;
public class RadioButtonPanel extends JFrame {
  public RadioButtonPanel()
  {
	ButtonGroup b = new ButtonGroup();
	JRadioButton b1 = new JRadioButton("java");
	JRadioButton b2 = new JRadioButton("c");
	JRadioButton b3 = new JRadioButton("cpp");
	
	b.add(b1);
	b.add(b2);
	b.add(b3);
	 add(b1);
	 add(b2);
	 add(b3);
    setLayout(new FlowLayout());
    /* add(new JLabel(labelString));
    for(int i=0; i<radioButtons.length; i++) {
//buttonGroup.add(radioButtons[i]);
      add(radioButtons[i]);} */

 setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
    }

 

public static void main(String s[])
{
/* JRadioButton jb[]=new JRadioButton[5];
for(int i=0;i<jb.length;i++)
jb[i]=new JRadioButton(i+1+" ");
ButtonGroup bg=new ButtonGroup();

new RadioButtonPanel("jb ex",jb,bg); */
new RadioButtonPanel();
}
}
