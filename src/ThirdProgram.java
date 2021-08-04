import java.applet.Applet;
import java.awt.*;

public class ThirdProgram extends Applet {
  Button b1,b2;
  Label l1,l2;
  TextField t1,t2;
  public void init()
  {  setSize(800,500);
	  l1=new Label("UserNAme");
	  l2=new Label("Password");
	  t1=new TextField(10);
	  t1.setBackground(Color.CYAN);
	  t2=new TextField(10);
	  t2.setEchoChar('*');
	  b1=new Button("SAVE");
	  b2=new Button("RESET");

	  add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);
  }
}
