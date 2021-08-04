 import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class MovingObject extends Applet {
	int x,y,w,x1,x2,x3,x4,x5,x6,x7;
	void slep() {
		try {
			  Thread.sleep(100);
		}
		catch(Exception e){
			
		}
	}
	public void init()
	  {
		setSize(1000,800);
	   y=30;
	   x=80;
	   x1=70;
	   x2=60;
	   x3=50;
	   x4=40;
	   x5=30;
	   x6=20;
	   x7=10;
	   
	  }
		public void paint(Graphics g)
		{
			w=getWidth();
			g.setColor(Color.BLUE);
			g.fillArc(x+10,30, 20, 20, 0, 360);
			g.drawLine(0,50,w,50);
			
			g.setColor(Color.red);
			g.fillArc(x1+10,70, 20, 20, 0, 360);
			g.drawLine(0,90,w,90);
			
			g.setColor(Color.yellow);
			g.fillArc(x2+10,110, 20, 20, 0, 360);
			g.drawLine(0,130,w,130);
			
			g.setColor(Color.green);
			g.fillArc(x3+10,150, 20, 20, 0, 360);
			g.drawLine(0,170,w,170);
			
			g.setColor(Color.cyan);
			g.fillArc(x4+10,190, 20, 20, 0, 360);
			g.drawLine(0,210,w,210);
			
			g.setColor(Color.magenta);
			g.fillArc(x5+10,230, 20, 20, 0, 360);
			g.drawLine(0,250,w,250);
			
			g.setColor(Color.orange);
			g.fillArc(x6+10,270, 20, 20, 0, 360);
			g.drawLine(0,290,w,290);
			
			g.setColor(Color.PINK);
			g.fillArc(x7+10,310, 20, 20, 0, 360);
			g.drawLine(0,330,w,330);
			
			
			
			
			
	        x=x+9;x1=x1+8;x2=x2+7;x3=x3+6; x4=x4+5;x5=x5+4;x6=x6+3;x7=x7+2;
	         slep();
	        if(x+100<w) {    
	        	repaint(); 
	        	}
	        
	        else
	        {   repaint(); x=20; y+=30;x1=20;x2=20;x3=20;x4=20;x5=20;x6=20;x7=20;
	          }
		}
	

	}


