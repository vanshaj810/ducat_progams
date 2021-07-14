import java.io.*;
class MyConsole
{
	public static void main(String...qq) throws IOException	
	{
		Console c= System.console();
		if(c!=null)
			System.out.println("console is available");
		System.out.println("enter a line");
		String s1= c.readLine();   //accept a line
		System.out.println("line is: "+s1);
		String s2= c.readLine("enter the name: ");
		System.out.println("your name is: "+s2);
		System.out.println("enter the password");
		char ch[]= c.readPassword();
		char ch1[]= c.readPassword("enter the password: ");
		System.out.println("pass1: "+new String(ch));
		System.out.println("pass2: "+new String(ch1));
		Reader r=c.reader();
		int x= r.read();
		System.out.println("via Reader class: "+x);
		PrintWriter pw= c.writer();
		pw.println("console via printwriter");
	}
}