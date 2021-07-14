import java.io.*;
import java.util.*;
class DriveSpace
{
	public static void main(String args[])//throws IOException
	{
		File f=new File("C:");
		double ts= f.getTotalSpace();
		System.out.println("total space on "+f+"="+ts+"  in bytes");
		double l=1024*1024*1024;
		System.out.println("total space="+ts/l+" in gb");
		double fs= f.getFreeSpace();
		System.out.println("free space on "+f+"="+fs+" in bytes");
		System.out.println("free space ="+fs/l+"in gb");
		
		 
	}
}