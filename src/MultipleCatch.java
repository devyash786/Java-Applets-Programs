
class MultipleCatch{    
  public static void main(String args[]){    
   try{    
    int a[]=new int[5];    
    a[10]=20/0;    
   }    
   catch(Exception e){System.out.println("Expection");}    
   catch(ArithmeticException e){System.out.println("Divide by zero not possible");}    
   catch(ArrayIndexOutOfBoundsException e){System.out.println("Array index is out of range");}    
   System.out.println("rest of the code...");    
 }    
}   