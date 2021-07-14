import java.io.*;
class DataStream2
{
	public static void main(String...l)throws IOException
	{
		DataInputStream din= new DataInputStream(System.in);
		FileOutputStream fout= new FileOutputStream("ducat.txt");
		PrintStream dout= new PrintStream(fout);
		String s="";
		while(!s.equals("stop"))
		{
			s= din.readLine();
			System.out.println(s);
			dout.println(s);
			//dout.flush();
		}
		din.close();
		dout.close();
		
		 
	}
}