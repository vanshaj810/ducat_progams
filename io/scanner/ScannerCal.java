import java.util.*;
class ScannerCal
{
	public static void main(String...qq) 
	{
		System.out.println("type somthing like 1+5");
		Scanner s= new Scanner(System.in);
		
		double n1,n2=0.0;
		String op=null;
		try
		{
			n1=s.nextDouble();
			op=s.next();
			n2=s.nextDouble();
			switch(op)
			
	{
		case "+": System.out.println(n1+n2);
					break; 
		case "-": System.out.println(n1-n2);
					 break;
		case "*": System.out.println(n1*n2);
					break; 
		case "/": System.out.println(n1/n2);
					break; 
		default : break;
	}
		}
		catch(Exception e){}
		 
	}
}
 