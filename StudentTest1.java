import java.util.Scanner;

import java.io.IOException;
import java.io.FileWriter;

public class StudentTest1 {
	static int a,c;
	static double b;
	static StudentBean1 s = new StudentBean1();
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("Student details");
		System.out.println("Enter your name:");
		s.setName(sc.nextLine());
		fw.write("Name: "+s.getName()+ "\n");
		System.out.println("Enter your roll number:");
		s.setRollNumber(sc.nextInt());
		sc.nextLine();
		fw.write("Roll no.: "+s.getRollNumber()+"\n");
		System.out.println("Enter your father name:");
		s.setFatherName(sc.nextLine());
		fw.write("Father's name: "+s.getFatherName()+"\n");
		System.out.println("Enter your school Name:");
		s.setSchoolName(sc.nextLine());
		fw.write("School name: "+s.getSchoolName()+"\n");
		System.out.println("Enter marks of first subject:");
		s.setMarks1(sc.nextInt());
		fw.write("Marks of first subject: "+s.getMarks1()+"\n");
		System.out.println("Enter marks of second subject:");
		s.setMarks2(sc.nextInt());
		fw.write("Marks of second subject: "+s.getMarks2()+"\n");
		System.out.println("Enter marks of third subject:");
		s.setMarks3(sc.nextInt());
		fw.write("Marks of third subject: "+s.getMarks3()+"\n");
		System.out.println("Enter marks of fourth subject:");
		s.setMarks4(sc.nextInt());
		fw.write("Marks of fourth subject: "+s.getMarks4()+"\n");
		System.out.println("Enter marks of fifth subject:");
		s.setMarks5(sc.nextInt());
		fw.write("MArks of fifth subject: "+s.getMarks5()+"\n");
		System.out.println("-----ur details are-----");
		System.out.println("Roll no. =" + s.getRollNumber());
		System.out.println("Name =" + s.getName());
		System.out.println("Father Name =" + s.getFatherName());
		System.out.println("School Name=" + s.getSchoolName());
		System.out.println("Total marks obtained :"+total());
		fw.write("Total marks obtained: "+total()+"\n");
		System.out.println("Percentage obtained: "+percentage());
		
		if(division()>=3)
			System.out.println("sorry! you failed this time.");
		else
			System.out.println("congratulations! you got "+division()+" division.");
		fw.write("Division obtained: "+division()+"\n");
		System.out.println("your data entered successfully");
		fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static int total()
 		{
			a = s.getMarks1() + s.getMarks2() + s.getMarks3()+ s.getMarks4() + s.getMarks5();
			return a;
 		}
	public static double percentage() 
		{
			b = total() / 5.0;
			return b;
		}
	
	public static int division()
	{
		if (percentage() >= 80)
			c=1;
		else if (percentage() >= 50 && percentage() < 80) 
			c=2;
		else if (percentage() >= 33 && percentage() < 50)
			c=3;
		return c;
	}
}
