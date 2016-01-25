import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JTextPane;
import javax.swing.JLabel;

		public class ShowFonts extends Applet
		{
			public ShowFonts() {
				//create variables
				
				//sample output
				JTextPane output = new JTextPane();
				add(output);
				output.setBounds(6, 22, 500, 500);
				//font family, style, size
				output.setFont(new Font("Century Gothic", Font.PLAIN, 15));
				//background & foreground color
				output.setBackground(new Color(240, 248, 255));
				output.setForeground(new Color(0, 0, 0));
				//set outputted text
				output.setText("Sample text");
			}
		   
			public static void main ( String [] args )
		   
		   //code to show all available fonts
		      {
		      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		      String[] names = ge.getAvailableFontFamilyNames();
		      for ( int i=0; i<names.length; i++ )
		         {
		             System.out.println( names[i] );
		         }
		      }
		}
		