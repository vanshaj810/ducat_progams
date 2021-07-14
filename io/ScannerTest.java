import java.util.Scanner;  
class ScannerTest{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in); 
   String add=null;
	//while (add.equals("exit")
	//{
	System.out.println("Enter your address");  
    add=sc.nextLine();
	//}
    System.out.println("Enter your name");  
   String name=sc.next();
   System.out.println("Enter your rollno");  
   int rollno=sc.nextInt();  
   System.out.println("Enter your fee");  
   double fee=sc.nextDouble();  
   System.out.println("Rollno: "+rollno+" name: "+name+" fee: "+fee);  
   System.out.println("Address is: "+add);
   sc.close();  
 }  
}   	