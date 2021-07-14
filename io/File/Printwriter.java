import java.io.*;
class Printwriter
{
	public static void main(String...qq) 
	{
		FileWriter fw=null;
		try
		{
			fw = new FileWriter("abc.txt");
		}catch(Exception e){}
		PrintWriter pw= new PrintWriter(fw);
		pw.println("hello");
		pw.println("hi");
		System.out.println("file create ");
		pw.close();
	}
}