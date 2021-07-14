import java.io.*;
class MyFileWriter3
{
	public static void main(String b[])throws IOException
	{
		try(FileOutputStream fw = new FileOutputStream("ranjan.txt");
		    FileInputStream fr = new FileInputStream("ranjan.txt");)
		{
			String s = "India ia a good country";
			byte ch[] = s.getBytes();
			for(int i=0;i<ch.length;i++)
				fw.write(ch[i]);
			fr.close();
			System.out.println("File create sucessfully");
			int i=0;
			while((i=fr.read())!=-1)
				System.out.println((char)i);
		}
		catch(IOException e){}
	}
} 
	