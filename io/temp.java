import java.io.*;
class temp
{
	public static void main(String...l)throws IOException
	{
		FileOutputStream fout= new FileOutputStream("aaa.txt");
		PrintStream ps= new PrintStream(fout);
		
		System.setOut(ps);
		System.out.println("hello");
		System.out.println("hay");
		FileOutputStream fout1= new FileOutputStream("aa.txt");
		PrintStream ps1= new PrintStream(fout1);
		
		System.setErr(ps1);
		System.out.println("hellooooooo");
		
	}
}