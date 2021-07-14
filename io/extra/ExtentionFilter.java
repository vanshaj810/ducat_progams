import java.io.*;
import java.util.*;
 class ExtentionFilter implements FilenameFilter
{
	
	String ext;
	int i=1;
	public ExtentionFilter(String ext)
	{
		this.ext=ext;
	}
	public boolean accept(File dir,String name)
	{
		System.out.println(i++);
		return name.endsWith(ext);
	}
}
 class ExtentionFilterEx
{
	public static void main(String[] args)//throws IOException
	{
		String dirname= "D:\\GYAN\\core\\io";
		File f=new File(dirname);
		FilenameFilter only= new ExtentionFilter("java");
		String s[]= f.list(only);
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		 
	}
}