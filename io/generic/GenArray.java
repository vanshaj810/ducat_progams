import java.lang.Integer;
class TGen<T extends Number>
{
	T ob;
	T vals[]; 
	TGen(T o,T[] num)
	{
		ob=o;
		vals=num; 
	}
}
public class GenArray
{  
	public static void main(String[] f)
	{
		Integer n[]={1,2,3,4,5};
		TGen<Integer>iob= new TGen<>(98,n);
		TGen<?>gens[]= new TGen<?>[2];
		gens[0]= new TGen<Integer>(10,n);
		System.out.println(gens[0].ob);
		gens[1]= new TGen<Float>(2.3f,new Float[]{1.2f,2.2f});
		for(int i=0;i<gens[0].vals.length;i++)
			System.out.println(gens[0].vals[i]);
 		for(int i=0;i<gens[1].vals.length;i++)
			System.out.println(gens[1].vals[i]);
		 
	}
}
 

