import java.io.*;
class DataRead
{
	public static void main(String...l)throws IOException
	{
		DataInputStream din= new DataInputStream(new FileInputStream("ducat.txt"));
		//read one line.. 
		String s="";
		while(s!=null)
		{
			s= din.readLine();
			if(s!=null)
				System.out.println(s);
		}
		din.close();
	}
}