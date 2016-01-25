import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;

//WHY WON'T APPLET SHOW?

		public class ShowFonts extends Applet
		{
			public ShowFonts() 
			{
				//create variables
				String fColor="BLACK";
				String bColor="WHITE";
				String fontFam="Century Gothic";
				String fontStyle;
				
				//create drop-down menu to select colors
				JComboBox colors = new JComboBox();
				colors.setBackground(new Color(238, 238, 238));
				add(colors);
				colors.addItem("WHITE");
				colors.addItem("BLACK");
				colors.addItem("RED");
				colors.setMaximumRowCount(13);
				
				//PROBLEM - action listener for color drop-down; drop-down in design window doesn't work
				
				colors.addActionListener(new ActionListener() {
					 
				public void actionPerformed(ActionEvent event) 
				{
					JComboBox<String> combo = (JComboBox<String>) event.getSource();
					String chosenColor = (String) combo.getSelectedItem();
				 
				        if (chosenColor.equals("WHITE")) 
				        {
				          
				        } 
				    }
				});
				
				//create button for user to test his/her selections
				JButton btnCheckItOut = new JButton("Check it out");
				add(btnCheckItOut);
				
				//sample output
				JTextPane output = new JTextPane();
				add(output);
				//why doesn't setBounds work?
				output.setBounds(6, 22, 500, 500);
				//font family, style, size
				output.setFont(new Font(fontFam, Font.PLAIN, 15));
				//background & foreground color
				//PROBLEM - WHY CAN'T VARIABLES BE REFERRED TO?
				output.setBackground(Color.WHITE);
				output.setForeground(Color.BLACK);
				//set output text
				//PROBLEM - CAN'T DISPLAY SPECIAL CHARACTERS
				output.setText("The quick brown fox jumped over the lazy dog’s back. \n"
						+ "Pack my box with five dozen liquor jugs. \n"
						+ "Jackdaws love my big sphinx of quartz. \n"
						+ "Mr. Jock, TV quiz PhD, bags few lynx.\n"
						+ "abcdefghijklmnopqrstuvwxyz \n"
						+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ \n"
						+ "01234567890 \n"
						//+ "€†™´¸¢©¤°÷½¼¾>¡¿«‘’<¯µ ·¬ªº¶±£""»®§­¹²³ß×™¨¥ \n"
						+ "ÀÁÂÃÄÅÆÇÈÉ ÊËÌÍÎÏÐÑÒÓÔ ÕÖØÙÚÛÜÝÞÿ \n"
						+ "àáâãäåæçèé êëìíîïðñòóô õöøùúûüýþÿ \n");
						//+ "!"#$%&'()*+,-./:;<=>?@[\^_z{|}~\n"
						//+ "uvw wW gq9 2z 5s il17|!j oO08 `'" ";:,. m nn rn {[()]}u\n");
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
		