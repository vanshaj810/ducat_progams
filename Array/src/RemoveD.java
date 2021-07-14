/*Remove duplicate number
   1 2 1 3 2 1 3 
   0 1 2 3 4 5 6
  i = 2
  j = 0
  b = false
*/
public class RemoveD {

	public static void main(String[] args) {
		 int a[] = TestArray.createArray();
		 TestArray.printArray(a);
		 System.out.println("After removing duplicate num: ");
		 for(int i=0;i<a.length;i++)
		 {
			 boolean b = true;
			 for(int j=0;j<i;j++)
				 if(a[i] == a[j])
				//	 1       1
					 b = false;
			if(b)
				System.out.print(a[i]+"\t");
		 }
	}

}
