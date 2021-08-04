import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventOnRadioButton1 extends Applet   {
   CheckboxGroup obj=new CheckboxGroup();
   Checkbox c1,c2,c3,c4;
   TextField t1;
   @Override
   public void init()
   { setSize(800,500);
	   c1=new Checkbox("Red",false,obj);
	   c2=new Checkbox("Green",false,obj);
	   c3=new Checkbox("yellow",false,obj);
	   c4=new Checkbox("Cyan",false,obj);
	   t1=new TextField(10);
	   add(t1);add(c1);add(c2);add(c3);add(c4);
	   
	   c1.addItemListener(new ItemListener()
			   {

				@Override
				public void itemStateChanged(ItemEvent e) {
					t1.setText("red");
					setBackground(Color.red);
					
				}
		       
			   });
	   c2.addItemListener(new ItemListener()
	   {

		@Override
		public void itemStateChanged(ItemEvent e) {
			t1.setText("green");
			setBackground(Color.green);
			
		}
       
	   });
	   c3.addItemListener(new ItemListener()
	   {

		@Override
		public void itemStateChanged(ItemEvent e) {
			t1.setText("yellow");
			setBackground(Color.yellow);
			
		}
       
	   });
	   c4.addItemListener(new ItemListener()
	   {

		@Override
		public void itemStateChanged(ItemEvent e) {
			t1.setText("cyan");
			setBackground(Color.cyan);
			
		}
       
	   });
	   
	   
	   
   }
	
	
	

	}
	
	


