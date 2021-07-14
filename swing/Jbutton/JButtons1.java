import javax.swing.*;
public class JButtons1 extends JFrame {
  public static void main(String[] args) {
    new JButtons1();
  }

  public JButtons1() {
    super("Using JButton");
   
    JButton button1 = new JButton("Java");
    add(button1);
  
    JButton button2 = new JButton("Python");
    add(button2);
    JButton button3 = new JButton("C");
    add(button3);
	setSize(300,300);
    setLayout(new FlowLayout()); 
    setVisible(true);
	//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
  }
}
