
import java.io.*;
class ByteReader
{
	public static void main(String...qq)
	{
		String s="lalu.txt"; 
		try(BufferedInputStream bis= new BufferedInputStream(s))
		{
			byte b;
			while((b=(byte)bis.read())!=-1)    //while((i=fr.read())!=-1)
				System.out.println((char)b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}