import java.io.*;
import java.util.*;
class DeleteFolder
{
	public static void main(String...qq)//throws IOException
	{
		File f=new File("D:\\GYAN\\core\\io\\dd");
		deleteFolder(f);
		f.delete();
	}
	public static void deleteFolder(File f)
	{
		File[] files=f.listFiles();
		for(File fi:files)
		{
			 if(fi.isDirectory())
				 deleteFolder(fi);
			 fi.delete();
		}
	}
}