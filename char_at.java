class char_at
{
	public static void main(String...g)
	{
		String s= "welcome";
		System.out.println("direct: "+s);
		System.out.println("Normal loop");
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("\nusing charactor array");
		char c[] = s.toCharArray();
		for(char i:c)
			System.out.print(i+" ");
		System.out.println("\nusing byte array");
		byte  c1[] = s.getBytes();
		for(int i=0;i<c1.length;i++)
		{
			System.out.print(c1[i]+" ");
		}
	}
}