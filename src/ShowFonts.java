import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

//WHY WON'T APPLET SHOW?
//do I need to do "implements Action Listener"

public class ShowFonts extends JFrame
		{
			private static final long serialVersionUID = 1L;
			private JTextPane output;
			private JComboBox colors;
			private JButton btnCheckItOut;

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
			
			public void ShowFonts(names[i]) 
			{
				//create variables
				String fColor="BLACK";
				String bColor="WHITE";
				String fontFam="Century Gothic";
				String fontStyle;

				//create drop-down menu to select colors
				colors = new JComboBox();
				colors.setBackground(new Color(238, 238, 238));
				add(colors);
				colors.addItem("WHITE");
				colors.addItem("GRAY");
				colors.addItem("BLACK");
				colors.addItem("PINK");
				colors.addItem("YELLOW");
				colors.addItem("MAGENTA");
				colors.addItem("BLUE");
				colors.addItem("LIGHT_GRAY");
				colors.addItem("DARK_GRAY");
				colors.addItem("RED");
				colors.addItem("ORANGE");
				colors.addItem("GREEN");
				colors.addItem("CYAN");
				
				//drop-down menu for selecting fonts
				JComboBox fonts = new JComboBox();
				fonts.setBackground(new Color(238, 238, 238));
				add(fonts);
				
				//add all fonts to drop-down menu - use loop w/ function?
				for ( int i=0; i<names.length; i++ )
				{
					fonts.addItem( names[i]);
				}
				
				//PROBLEM - action listener for color drop-down; drop-down in design window doesn't work
				
				
				//sample output
				output = new JTextPane();
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
				
				//create button for user to test his/her selections
				btnCheckItOut = new JButton("Check it out");
				add(btnCheckItOut);
						//+ "!"#$%&'()*+,-./:;<=>?@[\^_z{|}~\n"
						//+ "uvw wW gq9 2z 5s il17|!j oO08 `'" ";:,. m nn rn {[()]}u\n");
			}
			
			ShowFonts(names[i]);
		  
		}
		