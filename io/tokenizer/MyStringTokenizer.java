import java.util.*;
class MyStringTokenizer
{
	public static void main(String...qq) throws Exception
	{
		String str= "country=india;capital=delhi;country=japan;capital=tokeyo;";
		 
		StringTokenizer st= new StringTokenizer(str,";");
	
		while(st.hasMoreTokens())
		{
			 System.out.println(st.nextToken());
		}
	}
}