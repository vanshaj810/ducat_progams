import java.io.*;  
public class BufferedOutputStreamExample
{    
public static void main(String args[])throws Exception
{    
     FileOutputStream fout=new FileOutputStream("io.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="The java.io package contains nearly every class you might ever need to perform input and output (I/O) in Java. All these streams represent an input source and an output destination. The stream in the java.io package supports many data such as primitives, object, localized characters, etc.";
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();                                   
     System.out.println("success");    
	  
}    
}  