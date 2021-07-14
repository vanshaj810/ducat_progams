package twoD;

import java.util.Scanner;

import javax.lang.model.type.ArrayType;

public class Trangle {

	public static void main(String[] args) {
		 int a[][] = new int[3][3];
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter 9 elements: ");
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
			 {
				 System.out.println("enter data for index: "+i+j);
				 a[i][j] = sc.nextInt();
			 }
		 }
		 TestArray.printArray(a);
		 trangle1(a);
		 trangle2(a);
	}
	public static void trangle1(int[][] a) {
		System.out.println("***1st trangle****");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				if(j<=i)
					System.out.print(a[i][j]);
			System.out.println();
		}
	}
	public static void trangle2(int[][] a) {
		System.out.println("***2nd trangle****");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				if(j>=i)
					System.out.print(a[i][j]);
				else
					System.out.print(" ");
			System.out.println();
		}
	}
}
/*
 123		00	01	02
 546		10	11	12
 789		20	21	22
 
 1			0
 45			01
 789		012
 
 123
  56
   9
 */
