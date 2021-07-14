//Buffered writer/reader
import java.io.*;
class Bufferedwriter
{
	public static void main(String...qq)throws IOException
	{
		InputStreamReader ir= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);
		FileWriter fw= new FileWriter("acb.txt");
		 
		PrintWriter pw= new PrintWriter(fw);
		String s="";
		while(!s.equals("stop"))
		{
			s=br.readLine();
			pw.println(s);
		}
		pw.close();
		br.close();
    }
}
class Bufferedreader
{
	public static void main(String...qqq)throws IOException
	{
		FileReader fr= new FileReader("acb.txt");
		BufferedReader br= new BufferedReader(fr);
		String s="";
		while(s!=null)
		{
			s=br.readLine();
			if(s!=null)
				System.out.println(s);
			 
		}
	}
}