//To access and change the value of private and final field
import java.lang.reflect.Field;
public class FieldWithName
{
	public static void main(String ar[])throws Exception
	{
		Class cls=Temp.class;
		Temp t=new Temp();
		//t.x=13;
		Field field=cls.getDeclaredField("x");
		field.setAccessible(true); //give the premition for accessing the value
		System.out.println("Type of x : "+field);	
		System.out.println("value of x : "+field.get(t));
		field.set(t,5642);
		System.out.println("new value of x : "+field.get(t));
	}
}
class Temp
{
	private final int x=1000;
}