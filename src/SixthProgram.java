import java.applet.Applet;
import java.awt.*;
public class SixthProgram extends Applet {
   public void init()
   {
	    setSize(800,500);
	    Color c=new Color(222,111,222);
	    setBackground(c);
	    
	    Canvas canvas =new Canvas();
	    canvas.setSize(500,400);
	    canvas.setBackground(Color.yellow);
	    add(canvas);
	    
	    Scrollbar bar=new Scrollbar(Scrollbar.HORIZONTAL);
	    add(bar);
	    
	    Scrollbar bar1=new Scrollbar(Scrollbar.VERTICAL);
	    add(bar1);
	    
   }
}
