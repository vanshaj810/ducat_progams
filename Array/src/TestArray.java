import java.util.Scanner;
//Print 1st Greatest num...
//	8 5 6 2 4 7 3
//	0 1 2 3 4 5 6 
public class TestArray {
	public static void main(String[] args) {
		int a[] = createArray();
		printArray(a);
		int max = a[0],max1;	//2
		for(int i=1;i<a.length;i++)
		{
			if(a[i] > max)
				max = a[i];	//5 6 8 9
		}
		if(max == a[0])
			max1 = a[1];
		else
			max1 = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > max1 && a[i] < max)
				max1 = a[i];	//5 6 8 9
		}
		System.out.println("Greatest num inside array is = "+max);	
		System.out.println("2nd Greatest num inside array is = "+max1);	
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