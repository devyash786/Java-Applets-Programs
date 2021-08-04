import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Calculator extends Applet implements ActionListener {
   Button b1,b2;
   TextField t1,t2,t3;
   Choice c;
   @Override
   public void init()
   {
	    setSize(800,500);
	    t1=new TextField(10);
	    t2=new TextField(10);
	    t3=new TextField("Result is",10);
	    b1=new Button("=");
	    b2=new Button("RESET");
	    c=new Choice();
	    c.add("Select");
	    c.add("+");
	    c.add("-");
	    c.add("*");
	    c.add("/");
	    add(t1);add(c);add(t2);add(b1);add(t3);add(b2);
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	 }
   
    @Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			String operator=c.getSelectedItem();
			if(s1.length()==0||s2.length()==0)
			{
				JOptionPane.showMessageDialog(this,"Enter both values","Error",JOptionPane.ERROR_MESSAGE);
			}
			if(operator.equalsIgnoreCase("select"))
			{
				JOptionPane.showMessageDialog(this,"Select Operator","Error",JOptionPane.ERROR_MESSAGE);
			}
			else {
				double d1=Double.parseDouble(s1);
				double d2=Double.parseDouble(s2);
				double result=0.0;
				switch(operator)
				{ case "+": result=d1+d2;
				            break;
				 case "-": result=d1-d2;
		            break;   
				 case "*": result=d1*d2;
		            break;  
				 case "/": result=d1/d2;
		            break;       
				  
				}
				t3.setText("result is:"+result);
			}
		}
		if(e.getSource()==b2)
		{
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			c.select(0);
		}
	}
	

}
