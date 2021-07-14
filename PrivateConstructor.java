//Private Constructor(newInastance();)
import java.lang.reflect.Constructor;
class PrivateConstructor
{
	public static void main(String ar[])
	{
		try
		{
			//TmpConst t = new TmpConst();
			Class cl=TmpConst.class;
			Constructor c=cl.getDeclaredConstructor();
			c.setAccessible(true);//soluation
			TmpConst t1=(TmpConst)c.newInstance();
			System.out.println("ref id of t1 = "+t1);
			t1.show();
			
			Constructor c1=cl.getDeclaredConstructor(int.class);
			c1.setAccessible(true);
			TmpConst t2=(TmpConst)c1.newInstance(10);
			System.out.println("ref id of t2 = "+t2);
			t2.show();
		}
		catch(Exception e){}
	}
}
class TmpConst
{
	private TmpConst()
	{
		System.out.println("Default Constructor");
	}
	void show()
	{
		System.out.println("show");
	}
	private TmpConst(int x)
	{
		System.out.println(x+" via parameter Constructor");
	}
}