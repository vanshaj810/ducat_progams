package al;
import java.util.ArrayList;
import java.util.Iterator;

public class TestAL {
	public static void main(String[] args) {
		
		 ArrayList<Emp> al = new ArrayList<>();
		 al.add(new Emp("Ramu",56000));
		 al.add(new Emp("Kishan",76000));
		 al.add(new Emp("Shivani",80000));
		 al.add(new Emp("vivek",56321));
		 
		 System.out.println("My list is: "+al);
		 Iterator<Emp> i =  al.iterator();
		 System.out.println("Name\tSalary");
		 while(i.hasNext())
		 {
			 Emp e = i.next();
			 System.out.println(e.getName()+"\t"+e.getSalary());
		 }
		 
		 al.add(new Emp("Kishan",76000));
		 al.add(2,new Emp("Neha",49356));
		 System.out.println("After inserting elements: "+al);
	}
}
class Emp
{
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return name+" "+salary;
	}
	
}