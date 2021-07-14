import java.io.*;
class MyFileWriter
{
	public static void main(String...qq)throws IOException
	{
		//FileWriter fw= new FileWriter("duact1.txt");
		//FileWriter fw= new FileWriter("duact1.txt",true); //updatable
		FileWriter fw= new FileWriter("D:\\duact.txt",true);
		String s="India is a great contry ";
		char ch[]= s.toCharArray();
		for(int i=0;i<ch.length;i++)
			fw.write(ch[i]);
		fw.close();
		FileReader fr= new FileReader("D:\\duact.txt");
		int i=0;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		fr.close();
}
}