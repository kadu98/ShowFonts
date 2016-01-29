import java.awt.*;
import javax.swing.*;
public  class Frame extends JFrame{

  private Container c;

  public Frame()
  {
	c = this.getContentPane();
  }

  public void addPanel(JPanel p){
    p.setPreferredSize(new Dimension(500,400));
    c.add(p);
  }

  public void showFrame(){
    this.pack();
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
