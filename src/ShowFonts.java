import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JTextPane;

		public class ShowFonts
		{
		   public static void main ( String [] args )
		   
		   //code for foreground, background colors and fonts
		label = new JTextPane();
		label.setBounds(6, 22, 357, 207);
		label.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		label.setBackground(new Color(240, 248, 255));
		label.setForeground(new Color(0, 0, 0));
		label.setEditable(false);
		add(label);
		
		//display text
		label.setText("What's your name?");
		   
		   //code to show fonts
		      {
		      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		      String[] names = ge.getAvailableFontFamilyNames();
		      for ( int i=0; i<names.length; i++ )
		         {
		             System.out.println( names[i] );
		         }
		      }
		}
		