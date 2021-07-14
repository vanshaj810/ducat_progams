import java.awt.*;
import javax.swing.*;
public class JButtons extends JFrame {
  public static void main(String[] args) {
    new JButtons();
  }

  public JButtons() {
    super("Using JButton");
   //WindowUtilities.setMotifLookAndFeel() ;
    //addWindowListener(new ExitListener());
    Container content = getContentPane();
    content.setBackground(Color.RED);
    content.setLayout(new FlowLayout());
    JButton button1 = new JButton("Java");
    content.add(button1);
  
    JButton button2 = new JButton("Pyrhon");
    content.add(button2);
    JButton button3 = new JButton("Android");
    content.add(button3);
    JButton button4 = new JButton("c");
	setSize(300,300);
    content.add(button4);
    pack();
    setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE); 
  }
}
