package twoD;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
			int a[][] = createArray();
			printArray(a);
			int s = 0;
			for(int i=0;i<a.length;i++)
			 {
				 for(int j=0;j<a[i].length;j++)
					s += a[i][j];
			 }
			System.out.println("sum of all num = "+s);
	}

	public static void printArray(int[][] a) {
		 System.out.println("My array is: ");
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
				 System.out.print(a[i][j]+"\t");
			 System.out.println();
		 }
	}

	public static int[][] createArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and col of array: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		System.out.println("enter "+row*col+" value inside array: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("enter data for: "+i+j);
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}

}
