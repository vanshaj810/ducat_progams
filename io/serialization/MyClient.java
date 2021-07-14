//serialization
import java.io.*;
public class MyClient
{
	ObjectOutputStream dout;
	public MyClient()
	{
		try
		{
			emp e= new emp("ducat noida",10,5,50,100);
			dout= new ObjectOutputStream(new FileOutputStream("ducat.txt"));
			dout.writeObject(e); //write emp object
			dout.flush();
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String...q)
	{
		new MyClient();
	}
}