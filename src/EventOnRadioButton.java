import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class EventOnRadioButton extends Applet implements ItemListener{
	CheckboxGroup obj=new CheckboxGroup();
	Checkbox c1,c2,c3,c4;
	TextField t1;
	@Override
	public void init()
	{
		 setSize(800,500);
		 c1=new Checkbox("Red",false,obj);
		 c2=new Checkbox("Green",obj,true);
		 c3=new Checkbox("Yellow",false,obj);
		 t1=new TextField(10);
		 add(t1);add(c1);add(c2);add(c3);
		 c1.addItemListener(this);
		 c2.addItemListener(this);
		 c3.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==c1)
		{
			t1.setText("red");
			setBackground(Color.red);
		}
		if(e.getSource()==c2)
		{
			t1.setText("green");
			setBackground(Color.green);
		}
		if(e.getSource()==c3)
		{
			t1.setText("yellow");
			setBackground(Color.yellow);
		}
		
	}
}