import java.io.*;
import java.util.*;
class AllDriveSpace
{
	public static void main(String...qq)//throws IOException
	{
		File r[]=File.listRoots();
		 for(int i=0;i<r.length;i++)
		{ 
			System.out.println("free space:"+((r[i].getFreeSpace())/(1024*1024*1024))+" GB");
			System.out.println("usable space:"+((r[i].getUsableSpace())/(1024*1024*1024))+" GB");
			System.out.println("used space:"+(((r[i].getTotalSpace())/(1024*1024*1024))-((r[i].getUsableSpace())/(1024*1024*1024)))+" GB");
			System.out.println("total space:"+((r[i].getTotalSpace())/(1024*1024*1024))+" GB");
			System.out.println();
		} 
	}
}	