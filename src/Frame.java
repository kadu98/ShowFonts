import java.awt.*;
import javax.swing.*;
public  class Frame extends JFrame{

  private Container c;

  public Frame()
  {
	c = this.getContentPane();
  }

  public void addPanel(JPanel p){
    p.setPreferredSize(new Dimension(700,700));
    //color background
    p.setBackground(new Color(200,200,200));
    //add panel to frame
    c.add(p);
  }

  public void showFrame(){
    this.pack();
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
