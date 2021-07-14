import java.io.*;
import java.util.*;
class MyScanner1
{
	public static void main(String...qq) throws IOException
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the integer no:");
		int i=s.nextInt();
		System.out.println("enter the double type no:");
		double d= s.nextDouble();
		System.out.println("enter the float no:");
		float f= s.nextFloat();
		System.out.println("enter the long type no:");
		long l= s.nextLong();
		System.out.println("enter the string:");
		String c= s.next();
		System.out.println("your name is:"+c);
		System.out.println(i+" "+d+" "+f+" "+l);
	}
}