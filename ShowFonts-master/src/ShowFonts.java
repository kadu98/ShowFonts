import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.applet.Applet;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.border.EtchedBorder;


public class ShowFonts extends JPanel implements ActionListener
{
	//creates field variables 
	static JTextArea output;
	JComboBox<String> fontStyle;
	JComboBox<String> fontFam;
	static JComboBox<String> fontColor;
	static JComboBox<String> bgColor;
	private JTextField txtFontFamily;
	private JTextField txtFontStyle;
	private JTextField txtFontColor;
	private JTextField txtBackgroundColor;
	
	public ShowFonts() 
	{
		setBackground(new Color(248, 248, 255));
		//allows me to move components around
		setLayout(null);
		
		//create text area, set location of text area in frame, display text
		output = new JTextArea();
		add(output);
		output.setBounds(90, 150, 500, 400);
		//border
		output.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Try out different fonts & colors", TitledBorder.LEADING, TitledBorder.ABOVE_BOTTOM, null, new Color(0, 0, 0)));
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
		fontStyle.setBackground(new Color(248, 248, 255));
		fontStyle.setForeground(new Color(0, 0, 0));
		//connect fontStyle drop down to "this" action listener (action listener in outer class)
		fontStyle.addActionListener(this);
		fontStyle.setBounds(178, 32, 103, 30);
		add(fontStyle);
		fontStyle.addItem("None");
		fontStyle.addItem("Bold");
		fontStyle.addItem("Italic");
		
		//create drop-down menu for font families, set location in applet
		fontFam = new JComboBox<>();
		fontFam.setBackground(new Color(248, 248, 255));
		fontFam.setForeground(new Color(0, 0, 0));
		//connect fontfam drop down to "this" action listener
		fontFam.addActionListener(this);
		add(fontFam);
		fontFam.setBounds(23, 32, 141, 30);
		
		//create drop-down menu for text color
		fontColor = new JComboBox<>();
		fontColor.setBackground(new Color(248, 248, 255));
		fontColor.setForeground(new Color(0, 0, 0));
		fontColor.setBounds(307, 32, 132 ,30);
		//adding colors
		add(fontColor);
		fontColor.addActionListener(this);
		fontColor.addItem("Black");
		fontColor.addItem("Red");
		fontColor.addItem("Blue");
		fontColor.addItem("Green");
		fontColor.addItem("Yellow");
		fontColor.addItem("Pink");
		fontColor.addItem("White");
		fontColor.addItem("Orange");
		fontColor.addItem("Cyan");
		fontColor.addItem("Gray");
		fontColor.addItem("Magenta");
		
		//create drop-down menu for bg color
		bgColor = new JComboBox<>();
		bgColor.setBackground(new Color(248, 248, 255));
		bgColor.setForeground(new Color(0, 0, 0));
		bgColor.setBounds(460, 34, 132, 27);
		bgColor.addActionListener(this);
		add(bgColor);
		
		txtFontFamily = new JTextField();
		txtFontFamily.setBackground(new Color(245, 255, 250));
		txtFontFamily.setEditable(false);
		txtFontFamily.setHorizontalAlignment(SwingConstants.CENTER);
		txtFontFamily.setText("Font Family");
		txtFontFamily.setBounds(23, 6, 103, 26);
		add(txtFontFamily);
		txtFontFamily.setColumns(10);
		
		txtFontStyle = new JTextField();
		txtFontStyle.setBackground(new Color(245, 255, 250));
		txtFontStyle.setEditable(false);
		txtFontStyle.setText("Font Style\n");
		txtFontStyle.setHorizontalAlignment(SwingConstants.CENTER);
		txtFontStyle.setColumns(10);
		txtFontStyle.setBounds(178, 6, 103, 26);
		add(txtFontStyle);
		
		txtFontColor = new JTextField();
		txtFontColor.setBackground(new Color(245, 255, 250));
		txtFontColor.setEditable(false);
		txtFontColor.setText("Font Color");
		txtFontColor.setHorizontalAlignment(SwingConstants.CENTER);
		txtFontColor.setColumns(10);
		txtFontColor.setBounds(307, 6, 103, 26);
		add(txtFontColor);
		
		txtBackgroundColor = new JTextField();
		txtBackgroundColor.setBackground(new Color(245, 255, 250));
		txtBackgroundColor.setEditable(false);
		txtBackgroundColor.setText("Background Color");
		txtBackgroundColor.setHorizontalAlignment(SwingConstants.CENTER);
		txtBackgroundColor.setColumns(10);
		txtBackgroundColor.setBounds(462, 6, 130, 26);
		add(txtBackgroundColor);
		bgColor.addItem("White");
		bgColor.addItem("Red");
		bgColor.addItem("Blue");
		bgColor.addItem("Green");
		bgColor.addItem("Yellow");
		bgColor.addItem("Pink");
		bgColor.addItem("Black");
		bgColor.addItem("Orange");
		bgColor.addItem("Cyan");
		bgColor.addItem("Gray");
		bgColor.addItem("Magenta");
		
		//set array "fonts" to what function getfonts returns
		String[] fonts=GetFonts();
		
		//add all fonts to font family drop-down menu
		for ( int i=0; i<fonts.length; i++ )
		{
			fontFam.addItem( fonts[i]);
		}
	}
	
	
	//JD's method to get all fonts
	public static String[] GetFonts()
	{
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] names = ge.getAvailableFontFamilyNames();
      //for ( int i=0; i<names.length; i++ )
	      {
	          // System.out.println( names[i] );
	       }	    
      return names;
     }

	@Override
	//when an action is performed, the following will be triggered
	
	public void actionPerformed(ActionEvent event)
	{
		//color triggers action
		if(event.getSource() == fontColor){
			ShowFonts.fcolors();
		}
		
		//bg color
		if(event.getSource() == bgColor){
			ShowFonts.bcolors();
		}
			
		//if the object that triggers the action is fontFam/if fontFam performs the action
			if(event.getSource() == fontFam){
			//gets the item at the selected item
			String fontName = fontFam.getItemAt(fontFam.getSelectedIndex());
			//get the current font of the JTextArea output, then get the style of the current font 
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
			//set font in output to plain
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
	
	//function for text colors
	private static void fcolors()
	{
		//defining rgb values for colors in the hashmap
		int[] red = {255, 0, 0};
		int[] blue = {0, 0, 255};
		int[] black = {0, 0, 0};
		int[] green = {0, 255, 0};
		int[] white = {255, 255, 255};
		int[] pink = {255, 192, 203};
		int[] yellow = {255, 255, 0};
		int[] magenta = {255, 0, 255};
		int[] gray = {128,128,128};
		int[] cyan = {0, 255, 255};
		int[] orange = {255, 165, 0};
		
		//create hashmap and put values in
		HashMap<String, int[]> map = new HashMap<String, int[]>();
		map.put("Red", red);
		map.put("Blue", blue);
		map.put("Black", black);
		map.put("Green", green);
		map.put("White", white);
		map.put("Pink", pink);
		map.put("Yellow", yellow);
		map.put("Magenta", magenta);
		map.put("Gray", gray);
		map.put("Cyan", cyan);
		map.put("Orange", orange);
		
		//when color dropdown clicked and color selected store clicked color in selected
		//get the rgb value of selected from hashmap
		Object selected = fontColor.getSelectedItem();
		int[]rgb =  map.get(selected);
		int x = rgb[0];
		int y = rgb[1];
		int z = rgb[2];
		output.setForeground(new Color(x,y,z));
		
	}

	//function for bg colors
	private static void bcolors()
	{
		//defining rgb values for colors in the hashmap
		int[] red = {255, 0, 0};
		int[] blue = {0, 0, 255};
		int[] black = {0, 0, 0};
		int[] green = {0, 255, 0};
		int[] white = {255, 255, 255};
		int[] pink = {255, 192, 203};
		int[] yellow = {255, 255, 0};
		int[] magenta = {255, 0, 255};
		int[] gray = {125, 125, 125};
		int[] cyan = {0, 255, 255};
		int[] orange = {255, 165, 0};
		
		//create hashmap and put values in
		HashMap<String, int[]> map = new HashMap<String, int[]>();
		map.put("Red", red);
		map.put("Blue", blue);
		map.put("Black", black);
		map.put("Green", green);
		map.put("White", white);
		map.put("Pink", pink);
		map.put("Yellow", yellow);
		map.put("Magenta", magenta);
		map.put("Gray", gray);
		map.put("Cyan", cyan);
		map.put("Orange", orange);
		
		Object selected2 = bgColor.getSelectedItem();
		int[]rgb2 =  map.get(selected2);
		int a = rgb2[0];
		int b = rgb2[1];
		int c = rgb2[2];
		output.setBackground(new Color(a,b,c));
	}
}
	
	


