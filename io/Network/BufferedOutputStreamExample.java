import java.io.*;  
public class BufferedOutputStreamExample{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("aaa.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to ducat noida a-43 ";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
	  
}    
}  