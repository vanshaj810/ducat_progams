//read and write all charactor array.
//It is used to perform the operation on array.
import java.io.*;
class MyCharWriter
{
	public static void main(String...qq)throws IOException
	{
		CharArrayWriter fw= new CharArrayWriter();
		String s="India is a great contry";
		char ch[]= s.toCharArray();
		for(int i=0;i<ch.length;i++)
			fw.write(ch[i]);
		//1St way directly
		System.out.println("write directly:  "+fw.toString());
		//2Nd way  via CharArrayReader 	
		char z[]= fw.toCharArray();
		CharArrayReader fr= new CharArrayReader(z);
		int i=0;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
}
}