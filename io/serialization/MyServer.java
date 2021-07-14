//**********  20 sal bad  ***************
import java.io.*;
public class MyServer
{
	ObjectInputStream din;
	public MyServer()
	{
		try
		{
			din= new ObjectInputStream(new FileInputStream("ducat.txt"));
			emp z= (emp)din.readObject(); //read  emp object
			System.out.println("name= "+z.name);
			System.out.println("age= "+z.age);
			System.out.println("a= "+z.a);
			System.out.println("b= "+z.b);
			System.out.println("z= "+z.z);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String...q)
	{
		new MyServer();
	}
}