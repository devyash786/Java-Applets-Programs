import java.util.Scanner;

class Account{
      Scanner sc=new Scanner(System.in);
	  char cname[]=new char[20];
      int accno;
      String type;
      int balance;
      Account()
      {
        
        accno=0;
        type=" ";
        balance=0;
      }
      void input(){
        System.out.println("Enter customer name:");
		cname=sc.nextLine().toCharArray();
        System.out.println("Enter Account no");
		accno=sc.nextInt();
         System.out.println("Enter type,C for Current S for Saving");
		type=sc.nextLine();
         System.out.println("Enter balance");
		 balance=sc.nextInt();
      }
      void display(){
           System.out.print("\nCustomer Name: "+cname);
           System.out.print("\n Account Number: "+accno);
            System.out.print("\n Type: "+type);
             System.out.println("\n Balance "+balance);
      }
      void deposit(){
            int amt;
             System.out.println(" Enter the amount to deposit");
            amt=sc.nextInt();
            balance=balance+amt;
      }
}
class Sav_acc extends Account{
      Scanner sc=new Scanner(System.in);
	  int interest;
      int comp_int(){
         int time1,rate1;
         rate1=10;
         System.out.print("\n Enter time");
		 time1=sc.nextInt();
         interest=(int) (balance*Math.pow(1+rate1/100.0,time1)-balance);
         return interest;
      }

      void update_bal(){
         balance=balance+comp_int();
      }

      void withdrawal(){
         int amt;
         System.out.println("Enter amount to withdrawn");
         amt=sc.nextInt();
         if(balance>=amt){
               balance=balance-amt;
         }
         else{
               System.out.println("The amount cannot be withdrawn");
         }
      }
  }

class Curr_acc extends Account{
       Scanner sc=new Scanner(System.in);      
	  int chq_bk;
       int penal;
       int min_bal(){
          int ret1=1;
          if(balance<=500){
             penal=50;
             balance=balance-penal;
             ret1=0;
          }
          else{
            System.out.println("No penality imposed");
          }
          return ret1;
      }
      void withdrawal(){
          int amt;
          System.out.println("Enter the amount to withdrawn");
          amt=sc.nextInt();
          int k=min_bal();
          if(k==1){
             if(balance>=amt)
             balance=balance-amt;
          }
          else{
              System.out.println("The amount cannot be withdrawn");
          }
      }
   }

class Class1{   
public static void main(String args[]){
       Curr_acc c1=new  Curr_acc();
      Sav_acc  s1=new Sav_acc();
      c1.input();
      c1.display();
      c1.deposit();
      c1.display();
      c1.withdrawal();
      c1.display();
      s1.input();
      s1.display();
      s1.deposit();
      s1.display();
      s1.withdrawal();
      s1.display();
}   }