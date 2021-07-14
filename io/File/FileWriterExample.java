//it is use to create any type of  file  and store value in file byte by byte. 
import java.io.FileWriter;  
import java.io.IOException;  
public class FileWriterExample {  
    public static void main(String args[]){    
         try
		 {      
			FileWriter fw=new FileWriter("1.30pm.txt");  	//predefiend  classes 
			fw.write("I/O welcomming u");    
			System.out.println("Success..."); 		   
			fw.close(); 			
          }
		  catch(IOException e)
		  {System.out.println(e);}     
     }    
} 