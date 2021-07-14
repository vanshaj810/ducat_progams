//private method 
import java.lang.reflect.Method;
class GetMethod
{
	public static void main(String[] args)throws Exception
	{
		GetMethod1 m1=new GetMethod1();
		//System.out.println(m1.div(22,7));
		Class c=m1.getClass();//reflected image of object
		Method method=c.getDeclaredMethod("div",int.class,int.class); // calling method 
		method.setAccessible(true);//provide all permition
		System.out.println("Method name: "+method.getName());
		Double z=(Double)method.invoke(m1,22,7);   // use method
		System.out.println("after dividing no : "+z);
	}
}
class GetMethod1
{
	private double div(int numberA,int numberB)
	{
		return (double)numberA/numberB;
	}
	
}