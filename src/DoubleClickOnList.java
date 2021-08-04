import java.applet.Applet;
import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DoubleClickOnList extends Applet implements ActionListener {
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
		list.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
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
