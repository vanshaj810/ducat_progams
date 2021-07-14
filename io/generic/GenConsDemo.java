import java.lang.Integer;
class GenCons
{
	private  val;	
	<T extends Number>
	GenCons(T arg)
	{
	 	val= arg.doubleValue();
	}
	void showval() 
	{
		 System.out.println("val:"+ val);
	}
}
public class GenConsDemo
{  
	public static void main(String[] f)
	{
		 GenCons test1= new GenCons(100);
		 GenCons test2= new GenCons(100.3f);
		 test1.showval();
		 test2.showval();

	}
}
 

