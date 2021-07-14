import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("asp.txt");   
//create file over  network's data
             fout.write(97);    
             fout.write(98);    
             fout.write(99);    
             fout.write(100);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  