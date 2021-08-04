
public class TryCatchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data = 50/0;
		}
		catch(ArithmeticException e)
		{
		 System.out.println("Divide by zero not possible");
		}
		System.out.println("Rest of code");
	}

}
