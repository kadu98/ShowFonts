import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

public class ShowFonts extends Applet
{
	public ShowFonts() 
	{
		//create drop-down menu for font families
		JComboBox fontFam = new JComboBox();
		add(fontFam);
		
		/*add all fonts to font family drop-down menu
		for ( int i=0; i<array.length; i++ )
		{
			fontFam.addItem( array[i]);
		}
		*/
		
		//create text area
		JTextArea output = new JTextArea();
		add(output);
		output.setText("SAMPLE OUTPUT");
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
      return names[];
     }
	
}
