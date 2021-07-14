import java.io.*;
class MyStreamTokenizer
{
	public static void main(String...qq) throws IOException
	{
		FileInputStream fin= new FileInputStream("aaa.txt");
		InputStreamReader ir= new InputStreamReader(fin);
		StreamTokenizer st= new StreamTokenizer(ir);
		st.eolIsSignificant(true);
        st.wordChars(33,255);
		st.whitespaceChars(0,32);
		int token=0;
		int count=0;
		while(true)
		{
			token=st.nextToken();
			if(token==StreamTokenizer.TT_EOF)
				break;
			if(token==StreamTokenizer.TT_NUMBER)
				System.out.println(st.nval+" number");
			if(token==StreamTokenizer.TT_WORD)
				System.out.println(st.sval+" word");
			count++;
		}
		System.out.println("no of word in field ="+count);
	}
}