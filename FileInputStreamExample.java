import java.io.FileInputStream;  
public class FileInputStreamExample {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("alpha.txt"); 
            int i;
			while((i=fin.read())!=-1)   
				System.out.println((char)i+" : "+i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  