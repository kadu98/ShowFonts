import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

public class ShowFonts extends Applet
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
		output.setBounds(33, 67, 344, 158);
		output.setText("SAMPLE OUTPUT");
		
		//create drop-down menu for bold/italics
		JComboBox fontStyle = new JComboBox();
		fontStyle.setBounds(199, 19, 103, 30);
		add(fontStyle);
		fontStyle.addItem("Bold");
		fontStyle.addItem("Italic");
	}
		
	public static void main ( String [] args )
	{
		
	}
	
	public static String[] GetFonts()
	{
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] names = ge.getAvailableFontFamilyNames();
      int numFonts = names.length;
      for ( int i=0; i<names.length; i++ )
	      {
	           System.out.println( names[i] );
	       }	    
      //WHAT'S THE ISSUE
      return names[];
     }
}
