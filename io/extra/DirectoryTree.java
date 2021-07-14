import java.io.*;
import java.util.*;
class DirectoryTree
{
	public static void main(String args[])//throws IOException
	{
		File f=new File(args[0]);
		if(!f.exist())
		{
			System.out.println(args[0]+" does not exist");
			return;
		}
		tree(args[0]);
	}
	public static void tree(String fn)
	{
		File file=new File(fn);
		if(!file.isDirectory())
		{
			System.out.println(fn);
			return;
		}
		String files[]= file.list();
		for(int i=0;i<files.length;i++)
			tree(fn+File.seperate+files[i]);
		
	}
}