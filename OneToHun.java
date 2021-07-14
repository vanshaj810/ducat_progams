public class OneToHun {
	public static void main(String[] args) {
		int a[] = TestArray.createArray();
		TestArray.printArray(a);
		System.out.println("Except of 1 to 100: ");
		for(int i=1;i<=100;i++)
		{
			boolean b = true;
			for(int j:a) 
				if(i == j)
					b = false;
			 
			if(b)
				System.out.print(i+"\t");
		}
	}
}
/*
   2 5 6 8 99 98
   0 1 2 3 4  5
i = 2
j = 2
		1 3 4 7
*/