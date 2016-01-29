import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.applet.Applet;

public class ShowFonts extends JPanel implements ActionListener
{
	public ShowFonts() 
	{
		//allows me to move components around
		setLayout(null);
		
		//create drop-down menu for font families, set location in applet
		JComboBox fontFam = new JComboBox();
		add(fontFam);
		fontFam.setBounds(23, 19, 141, 30);
		fontFam.addItem("test1");
		fontFam.addItem("test2");
		
		/*add all fonts to font family drop-down menu
		for ( int i=0; i<array.length; i++ )
		{
			fontFam.addItem( array[i]);
		}
		*/
		
		//create text area, set location in applet, display text
		JTextArea output = new JTextArea();
		add(output);
		output.setBounds(33, 67, 368, 203);
		output.setText(
				"The quick brown fox jumped over the lazy dog’s back. \n "
				+ "Pack my box with five dozen liquor jugs. \n"
				+ "Jackdaws love my big sphinx of quartz. \n"
				+ "Mr. Jock, TV quiz PhD, bags few lynx. \n"
				+ "abcdefghijklmnopqrstuvwxyz\n "
				+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ\n "
				+ "01234567890 \n"
				+ "€†™´¸¢©¤°÷½¼¾>¡¿«‘’<¯µ ·¬ªº¶±£\"»®§­¹²³ß×™¨¥\n" 
				+ "ÀÁÂÃÄÅÆÇÈÉ ÊËÌÍÎÏÐÑÒÓÔ ÕÖØÙÚÛÜÝÞÿ\n"
				+ "àáâãäåæçèé êëìíîïðñòóô õöøùúûüýþÿ\n"
				+ "!\"#$%&\'()*+,-./:;<=>?@[\\^_z{|}~\n"
				+ "uvw wW gq9 2z 5s il17|!j oO08 `\'\" ;:,. m nn rn {[()]}u\"");
		
		//create drop-down menu for bold/italics
		JComboBox fontStyle = new JComboBox();
		fontStyle.setBounds(199, 19, 103, 30);
		add(fontStyle);
		fontStyle.addItem("Bold");
		fontStyle.addItem("Italic");
	}
	
	public static String[] GetFonts()
	{
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] names = ge.getAvailableFontFamilyNames();
      for ( int i=0; i<names.length; i++ )
	      {
	           System.out.println( names[i] );
	       }	    
      return names;
     }
}

