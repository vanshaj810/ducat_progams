import java.lang.Integer;
class ThreeGen<T,V,gyan>
{
	T ob1;
	V ob2;
	gyan ob3;
	ThreeGen(T o1,V o2,gyan o3)
	{
		ob1=o1;
		ob2=o2;
		ob3=o3;
	}
	void showtype()
	{
		System.out.println("Type of T is:"+ob1.getClass().getName()); 
		System.out.println("Type of V is:"+ob2.getClass().getName());
		System.out.println("Type of gyan is:"+ob3.getClass().getName());
	}
	
	T getob1()
	{
		return ob1;
	}
	V getob2()
	{
		return ob2;
	}
	gyan getob3()
	{
		return ob3;
	}
	public static void main(String[] f)
	{
		ThreeGen<Integer,String,Double>iob= new ThreeGen<>(98,"GYAN",8.9);
		iob.showtype();
		int v= iob.getob1();
		System.out.println("value"+v);
		 
		String str= iob.getob2();
		System.out.println("value"+str);
		 
		Double e2= iob.getob3();
		System.out.println("value"+e2);
		 
	}
}
 

