import java.io.*;
import java.util.*;
class EmptyDir
{
	public static void main(String args[])//throws IOException
	{
		File f=new File("D:\\java\\io");
		if(f.isDirectory())
		{
			String[] files= f.list();
			if(files.length>0)
				System.out.println("the "+f.getPath()+"is not empty");
		}
		 
	}
}