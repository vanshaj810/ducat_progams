import java.io.*;
import java.util.*;
class StreamTokenizerEx
{
	public static void main(String...qq) throws IOException
	{
		String str= "this is good thinks 1000";
		StreamReader sr= new StreamReader(str);
		StreamTokenizer st= new StreamTokenizer(sr);
	
		while(st.nextToken()!=TT_EOF)
		{
			switch(st.ttype)
			{
				case TT_WORD: System.out.println(st.sval+" word");
							  break;
				case TT_NUMBER: System.out.println(st.nval+" word");
							  break;			  
			}
		}
	}
}