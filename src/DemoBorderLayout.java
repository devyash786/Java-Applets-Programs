import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoBorderLayout extends Applet implements ActionListener {
	  Button b1,b2,b3,b4;
	     TextField t1;
	     @Override
	     public void init()
	     {   
	    	 
	    	 setSize(800,500);
	     Button b1=new Button("Red");
	     Button b2=new Button("Green");
	     Button b3=new Button("Cyan");
	     Button b4=new Button("yellow");
	     t1=new TextField(10);
	     setLayout(new BorderLayout());
	     add("East",t1);
	     add("West",b1);
	     add(BorderLayout.NORTH,b2);
	     add(BorderLayout.SOUTH,b3);
	     add(BorderLayout.CENTER,b4);
	     b1.addActionListener(this);
	     b2.addActionListener(this);
	     b3.addActionListener(this);
	     b4.addActionListener(this);
}
		@Override
		public void actionPerformed(ActionEvent e) {
			String str=e.getActionCommand();
			if(str.equalsIgnoreCase("Red"))
			{
				t1.setText("Red");
				setBackground(Color.red);
				
			}
		
		if(str.equalsIgnoreCase("Green"))
		{
			t1.setText("Green");
			setBackground(Color.green);
			
		}if(str.equalsIgnoreCase("Cyan"))
		{
			t1.setText("cyan");
			setBackground(Color.cyan);
			
		}if(str.equalsIgnoreCase("yelow"))
		{
			t1.setText("yellow");
			setBackground(Color.yellow);
			
		}
			
		}}

public class DemoBorderLayout {

}
