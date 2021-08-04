import java.applet.Applet;
import java.awt.*;

public class FiftProgram extends Applet{
	List list;
	Choice choice;
	public void init()
	{
		 setSize(800,500);
		 list=new List(8);
		 list.add("ITEM1");
		 list.add("ITEM1");
		 list.add("ITEM1");
		 list.add("ITEM1");
		 list.add("ITEM1");
		 list.add("ITEM1");
		 list.add("ITEM1");
		 list.add("ITEM1");
		 list.add("ITEM1");
		 list.add("ITEM1");
		 list.add("ITEM1");
		 list.add("ITEM1");
		 
		 add(list);
		 
		 choice =new Choice();
		 choice.add("Item1");
		 choice.add("Item2");
		 add(choice);
		 
		 
	}

}
