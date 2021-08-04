import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class SecondProgram extends Applet {
  @Override
  public void init()
  {setSize(500,300);
   setForeground(Color.red);
   setBackground(Color.CYAN);
   
	  
  }
	@Override
	public void paint(Graphics g)
	{
	//g.drawLine(10, 10, 100, 100);
//g.drawRoundRect(100, 200, 200, 200, 2000, 100);
		/*g.drawRect(20,10,100,100);
		g.drawRoundRect(130,10, 100, 100, 30, 30);
		g.fillRect(130, 120, 100, 100);
		g.fillRoundRect(20, 120, 100, 100, 30, 30);
		g.drawOval(300,100, 200, 100);*/
		int x[]= {200,250,300,300};
		int y[]= {400,450,500,550};
		g.drawPolygon(x, y, 4);
	}

	

}
