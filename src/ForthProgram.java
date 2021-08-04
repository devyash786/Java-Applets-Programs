import java.applet.Applet;
import java.awt.*;
public class ForthProgram extends Applet {
    TextArea ta;
    Checkbox c1,c2,c3,c4,c5,c6;
    public void init()
    {
    	 setSize(800,500);
    	 ta=new TextArea(5,20);
    	 ta.setBackground(Color.GREEN);
    	 add(ta);
    	 
    	 c1=new Checkbox("JDK");
    	 c2=new Checkbox("JRE");
    	 c3=new Checkbox("JDK");
    	 add(c1);add(c2);add(c3);
    	 
    	 CheckboxGroup obj=new CheckboxGroup();
    	 c4=new Checkbox("JAVA",false,obj);
    	 c5=new Checkbox("Python",false,obj);
    	 c6=new Checkbox("Aws",false,obj);
    	 add(c4);add(c5);add(c6);
    }
}
