//convert char array to string
class connect
{
	public static void main(String...g)
	{
		char c[] = {'a','b','c','d','e'};
		String s = new String(c);
		System.out.println("string vis char array: "+s);
		 String s1= "hello";
		String s2 = s1+10;
		String s3 = s1.concat(" hi");
		String a = 10+20+2.6+s1+" hi "+30+40+'a';  //string concatination
		System.out.println(s1);
		System.out.println(s2); 
		System.out.println(s3); 
		System.out.println(a); 
		System.out.println('a'); 
		System.out.println('a'+'b'); 
	}
}
