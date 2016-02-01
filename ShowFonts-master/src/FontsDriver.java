import java.awt.EventQueue;

public class FontsDriver
{
	 public static void main(String[] args)
	 {
		 EventQueue.invokeLater(new Runnable(){
			 public void run(){
				 //creates frame
				    Frame d = new Frame();
				 //creates ShowFonts panel, creates everything in ShowFonts
				    ShowFonts p = new ShowFonts();
				   //add panel & frame
				    d.addPanel(p);
				    d.showFrame();
			 }
		 });
	 }
}
