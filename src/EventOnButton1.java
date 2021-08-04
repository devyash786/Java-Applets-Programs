import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventOnButton1 extends Applet
{
   Button b1,b2,b3,b4;
   TextField t1;
   @Override
   public void init()
   {  setSize(800,500);
	   b1=new Button("Red");
	   b2=new Button("Green");
	   b3=new Button("Blue");
	   b4=new Button("Cyan");
	   t1=new TextField(10);
	   add(t1);add(b1);add(b2);add(b3);add(b4);
	   b1.addActionListener(new ActionListener()
			   { 
	           @Override
			    public void actionPerformed(ActionEvent e)
	           {
				String str=e.getActionCommand();
			     t1.setText(str);
			     setBackground(Color.red);}
			   });
	   b2.addActionListener(new ActionListener()
	   { 
           @Override
		    public void actionPerformed(ActionEvent e)
           {
			String str=e.getActionCommand();
		     t1.setText(str);
		     setBackground(Color.green);}
		   });
	   b3.addActionListener(new ActionListener()
	   { 
           @Override
		    public void actionPerformed(ActionEvent e)
           {
			String str=e.getActionCommand();
		     t1.setText(str);
		     setBackground(Color.blue);}
		   });
	   b4.addActionListener(new ActionListener()
	   { 
           @Override
		    public void actionPerformed(ActionEvent e)
           {
			String str=e.getActionCommand();
		     t1.setText(str);
		     setBackground(Color.cyan);}
		   });
	   
   }
	
	
	
	

	
}
