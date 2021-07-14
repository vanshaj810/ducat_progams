import java.util.Scanner;
//Print 1st Greatest num...
//	2 5 3 6 4 8 9
//	0 1 2 3 4 5 6 
public class TestArray {
	public static void main(String[] args) {
		int a[] = createArray();
		printArray(a);
		int max = a[0];	//2
		for(int i=1;i<a.length;i++)
		{
			if(a[i] > max)
				max = a[i];	//5 6 8 9
		}
		System.out.println("Greatest num inside array is = "+max);		
	}
	public static int[] createArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int len = sc.nextInt();
		int a[] = new int[len];
		System.out.println("enter "+len+" value inside array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		return a;
	}
	public static void printArray(int[] a) {
		System.out.println("My Array is: ");
		for(int i:a)
			System.out.print(i+"\t");
		System.out.println();
	}
}