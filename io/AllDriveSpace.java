import java.io.*;
import java.util.*;
class AllDriveSpace
{
	public static void main(String...qq)//throws IOException
	{
		File r[]=File.listRoots();
		for(int i=0;i<r.length;i++)
		{
			System.out.println("free space: "+r[i].getFreeSpace());
			System.out.println("usable space: "+r[i].getUsableSpace());
			System.out.println("total space: "+r[i].getTotalSpace());
			System.out.println();
		}
	}
}