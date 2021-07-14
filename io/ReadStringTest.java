import java.io.Console;  
class ReadStringTest{    
public static void main(String args[]){    
Console c=System.console();    
System.out.println("Enter your name: ");    
String n=c.readLine();    
System.out.println("Welcome "+n);   

Console c1=System.console();    
System.out.println("Enter password: ");    
char[] ch=c1.readPassword();    
String pass=String.valueOf(ch);//converting char array into string    
System.out.println("Password is: "+pass);    
}    
}  