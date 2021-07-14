import java.io.*;
class MyFileWriter
{	 
	public static void main(String a[])throws IOException
	{	int c=1;
		//FileOutputStream fw = new FileOutputStream("6.00.txt");
		FileOutputStream fw = new FileOutputStream("6.00.txt",true);
		//FileOutputStream fw = new FileOutputStream(new File("E:\\gyan.txt"));
		//FileOutputStream fw = new FileOutputStream(new File("E:\\gyan.txt"),true);
		 String s = " good morning ducat";
		byte ch[] = s.getBytes();
		for (int i=0; i<ch.length; i++)
		{	if(ch[i]==32&&ch[i+1]!=32)
				c++;	
			fw.write(ch[i]);
		}
		fw.close();
		System.out.println("file create sucessfully");
		System.out.println("no. of words= "+c);
	}
}
class MyFileWriter1
{
	public static void main(String a[])throws IOException
	{
		FileInputStream fr = new FileInputStream("7.30.txt");
		//FileInputStream fr = new FileInputStream(new File("E:\\gyan.txt"));
		int i=0;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		//System.out.println("no. of words= "+c);
		fr.close();
	}
}
class MyFileWriter2
{
	public static void main(String a[])throws IOException
	{
		FileInputStream fr = new FileInputStream("7.30.txt");
		byte b[]= new byte[fr.available()];
		fr.read(b);
		String s = new String(b);
		System.out.println(s);
	}
}