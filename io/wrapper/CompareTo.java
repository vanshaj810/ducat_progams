import java.lang.Integer;
class CompareTo 
{
	public static void main(String... d)
	{
		Integer i1=new Integer(10);
 
		Integer i2=new Integer(10);
		int r=i1.compareTo(i2);
		System.out.println(r);
		Character c1= new Character('a');
		Character c2= new Character('A');
		 r= c1.compareTo(c2);
		System.out.println(r);	
	}
}	