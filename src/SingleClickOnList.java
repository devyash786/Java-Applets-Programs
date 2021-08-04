import java.applet.Applet;
import java.awt.Color;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SingleClickOnList extends Applet implements ItemListener {
	List list;
	@Override
	public void init()
	{   setSize(800,500);
		list =new List();
		list.add("RED");
		list.add("Green");
		list.add("Yellow");
		list.add("Cyan");
		add(list);
		list.addItemListener(this);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String s=list.getSelectedItem();
		if(s.equalsIgnoreCase("red"))
			setBackground(Color.red);
		if(s.equalsIgnoreCase("Green"))
			setBackground(Color.green);
		if(s.equalsIgnoreCase("yellow"))
			setBackground(Color.yellow);
		if(s.equalsIgnoreCase("cyan"))
			setBackground(Color.cyan);
		
	}
	
	

}
