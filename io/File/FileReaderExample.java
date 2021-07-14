// read any type of file byte by byte.
import java.io.FileReader;  
  class FileReaderExample 
{  
    public static void main(String args[])throws Exception
	{    
        FileReader fr=new FileReader("1.30pm.txt");    
        int i;    
        while((i=fr.read())!=-1)    
			System.out.print((char)i);    
			//System.out.println(i+" "+(char)i);    
		System.out.println("\n i : "+i);    
		fr.close();    
    }    
}    