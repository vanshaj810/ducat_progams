class Diff
{
	public static void main(String...g)
	{
		String s = new String("ram");
		long t1 = System.currentTimeMillis();
		for(int i=0;i<10000;i++)
			s.concat("lal");
		long t2 = System.currentTimeMillis();
		System.out.println("String takes time for conn: "+(t2-t1)+" ms");
		StringBuffer sb = new StringBuffer("ram");
		t1 = System.currentTimeMillis();
		for(int i=0;i<10000;i++)
			sb.append("lal");
		t2 = System.currentTimeMillis();
		System.out.println("StringBuffer takes time for conn: "+(t2-t1)+" ms");
		StringBuilder sb1 = new StringBuilder("ram");
		  t1 = System.currentTimeMillis();
		for(int i=0;i<10000;i++)
			sb1.append("lal");
		  t2 = System.currentTimeMillis();
		System.out.println("StringBuilder takes time for conn: "+(t2-t1)+" ms");
	}
}