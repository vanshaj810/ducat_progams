import java.io.*;
class Ps
{
	public static void main(String...l)throws IOException
	{
		FileOutputStream fout= new FileOutputStream("chachi.txt");
		PrintStream ps= new PrintStream(fout);
		FileOutputStream fout1= new FileOutputStream("chacha.txt",true);
		PrintStream ps1= new PrintStream(fout1);
		System.out.println("before");
		PrintStream ps4= System.out;
		//System.out.println("hay");
		System.setOut(ps);
		System.setErr(ps1);
		System.out.println("chachi420");
		System.out.println("chachi840");
		System.out.println("chacha420");
		System.out.println("chachi840");
		System.setOut(ps1);
		System.out.println("chacha240");
		System.setOut(ps4);
		ps4.println("after");
		System.out.println("via actual out");
	}
}