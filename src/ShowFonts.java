import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

public class ShowFonts extends Applet
{
	   public static void main ( String [] args )
	      {
	      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	      String[] names = ge.getAvailableFontFamilyNames();
	      for ( int i=0; i<names.length; i++ )
	         {
	             System.out.println( names[i] );
	         }
	      }
}
