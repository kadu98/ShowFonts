import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.applet.Applet;
import java.util.Arrays;

public class ShowFonts extends JPanel implements ActionListener
{
	JTextArea output;
	JComboBox<String> fontStyle;
	JComboBox<String> fontFam;
	
	public ShowFonts() 
	{
		//allows me to move components around
		setLayout(null);
		
		//create text area, set location in applet, display text
		output = new JTextArea();
		add(output);
		output.setBounds(33, 67, 460, 337);
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
		fontStyle = new JComboBox<>();
		fontStyle.addActionListener(this);
		fontStyle.setBounds(199, 19, 103, 30);
		add(fontStyle);
		fontStyle.addItem("None");
		fontStyle.addItem("Bold");
		fontStyle.addItem("Italic");
		
		//create drop-down menu for font families, set location in applet
		fontFam = new JComboBox<>();
		fontFam.addActionListener(this);
		add(fontFam);
		fontFam.setBounds(23, 19, 141, 30);
		
		//set array "fonts" to what function getfonts returns
		String[] fonts=GetFonts();
		
		//add all fonts to font family drop-down menu
		for ( int i=0; i<fonts.length; i++ )
		{
			fontFam.addItem( fonts[i]);
		}
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

	@Override
	public void actionPerformed(ActionEvent event)
	{
		//if the object that triggers the action is fontFam/if fontFam performs action
		if(event.getSource() == fontFam){
			//gets the item at the selected item
			String fontName = fontFam.getItemAt(fontFam.getSelectedIndex());
			//get the current font of the JTextArea output, and get the style of the current font 
			int currentStyle = output.getFont().getStyle();
			//set font size 
			int size = 14;
			//set the font of text area to below
			output.setFont(new Font(fontName, currentStyle, size));
		}
		
		if(event.getSource() == fontStyle){
		if (fontStyle.getSelectedItem()=="None")
		{
			//get font in output and assign to variable "font"
			Font font = output.getFont();  
			//set font in output to bold
			output.setFont(font.deriveFont(Font.PLAIN));
		}
		
		if (fontStyle.getSelectedItem()=="Bold")
		{
			//get font in output and assign to variable "font"
			Font font = output.getFont();  
			//set font in output to bold
			output.setFont(font.deriveFont(Font.BOLD));
		}
		if (fontStyle.getSelectedItem()=="Italic")
		{
			//get font in output and assign to variable "font"
			Font font = output.getFont();  
			//set font in output to italic
			output.setFont(font.deriveFont(Font.ITALIC));
		}
		}
	}
}

