import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class FirstProgram extends Applet implements ActionListener  
{  
    TextField t1 = new TextField(10);  
    TextField t2 = new TextField(10);  
    TextField t3 = new TextField(10);  
    Label l1 = new Label("First Number:");  
    Label l2 = new Label("Second Number:");  
    Label l3 = new Label("Result:");  
    Button b1 = new Button("Addition");
    Button b2 = new Button("Subtraction");
    Button b3 = new Button("Multiplication");
    @Override
    public void init()  
    {   add(l1);  
        add(t1);  
        add(l2);  
        add(t2);  
        add(l3);  
        add(t3);  
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
        
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == b1)  
        {  
            int x = Integer.parseInt(t1.getText());  
            int y = Integer.parseInt(t2.getText());  
            t3.setText(" " + (x +y));  
        }  
        if (e.getSource() == b2)  
        {  
            int x = Integer.parseInt(t1.getText());  
            int y = Integer.parseInt(t2.getText());  
            t3.setText(" " + (x-y));  
        }  
        if (e.getSource() == b3)  
        {  
            int x = Integer.parseInt(t1.getText());  
            int y = Integer.parseInt(t2.getText());  
            t3.setText(" " + (x*y));  
        }  
        
    }  
}  