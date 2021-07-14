import java.io.*;
import java.util.*;
class ZipFile
{
	public static void main(String...qq)throws IOException
	{
		FileOutputStream fos= new FileOutputStream("text1.zip");
		ZipOutputStream zos= new ZipOutputStream(fos);
		String f1= "aaa.txt";
		String f2= "ducat.txt";
		String f3= "gyan.txt";
		String f4= "chachi.txt";
		String f5= "chacha.txt";
		addToZipFile(f1,zos);
		addToZipFile(f2,zos);
		addToZipFile(f3,zos);
		addToZipFile(f4,zos);
		addToZipFile(f5,zos);
		zos.close();
		fos.close();	
	}	

public static void addToZipFile(String f,ZipOutputStream zos) throws IOException
{
	System.out.println("writting"+f+"to zip file");
	File file= new File(f);
	FileInputStream fis= new FileInputStream(file);
	ZipEntry z= new ZipEntry(f);
	zos.putNextEntry(z);
	byte[] b= new byte[fis.available()];
	fis.read(b);
	zos.write(b);
	zos.closeEntry();
	fis.close();
	
}	
}