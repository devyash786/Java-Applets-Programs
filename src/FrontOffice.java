import java.util.Scanner;

public class FrontOffice {

	public static void main(String[] args) {
		int x;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Roll No");
		x=sc.nextInt();
		if(x>0 && x<=10)
		 {Clerk ck= new Clerk();
		 char gr= ck.provideGrade(x);
		 System.out.println("Roll No:"+x+" has "+gr+" grade ");
			
		 }
		else {System.out.println("Roll no not there");
			return ;}
		

	}

}
class Clerk{
	char provideGrade(int x)
		{
		  Teacher tc=new Teacher();
		  int marks=tc.provideMarks(x);
		  if(marks>=80)
			return 'A';
		  else if(marks>=60 && marks<80)
			return 'B';
		  else if(marks>=50 && marks<60)
			return 'C';
		  else 
		    return 'F';
		}
	}
class Teacher{
  int marks[]={56,67,87,97,45,67,84,32,99,64};
  int provideMarks(int x)
   {
      return marks[x-1];
   }
}
