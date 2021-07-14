/*Remove duplicate number
//	1 2 1 3 2 1 3 
//  0 1 2 3 4 5 6
 * 	1 -> 3 times
 * 2 -> 2 times
 * 3 -> 2 times
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
					 b = false;
			if(b)
				System.out.print(a[i]+"\t");
		 }
	}

}
