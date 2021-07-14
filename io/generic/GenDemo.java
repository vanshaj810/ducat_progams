import java.lang.Integer;
class Gen<T>
{
	T ob;
	Gen(T o)
	{
		ob=o;
	}
	T getob()
	{
		return ob;
	}
	void showtype()
	{
		Class c= ob.getClass();
		System.out.println("Type of T is:"+c.getName());
	}
}
public class GenDemo
{
	public static void main(String[] f)
	{
		Gen<Integer>iob= new Gen<Integer>(98);
		iob.showtype();
		int v= iob.getob();
		System.out.println("value"+v);
		//Gen<String>strob= new Gen<>("998");
		Gen<String>strob= new Gen<String>("0998");
		strob.showtype();
		String str= strob.getob();
		System.out.println("value"+str);
		Emp e= new Emp();
		Gen<Emp>eob= new Gen<Emp>(e);
		eob.showtype();
		Emp e2= eob.getob();
		System.out.println("value"+e2.x);
		//iob=strob;
	}
}
class Emp
{
	int x=200;
}

