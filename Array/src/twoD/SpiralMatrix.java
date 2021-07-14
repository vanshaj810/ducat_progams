package twoD;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row and col of array: ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		int a[][] = new int[row][col];
		int sr=0,sc=0,er=row-1,ec=col-1,c=0;
		while(true)
		{
			for(int i=sc;i<=ec;i++)
				a[sr][i] = ++c;
			sr++;
			if(row*col == c)
				break;
			
			for(int i=sr;i<=er;i++)
				a[i][ec] = ++c;
			ec--;
			if(row*col == c)
				break;
			
			for(int i=ec;i>=sc;i--)
				a[er][i] = ++c;
			er--;
			if(row*col == c)
				break;
			
			for(int i=er;i>=sr;i--)
				a[i][sc] = ++c;
			 sc++;
			if(row*col == c)
				break;
		}
		TestArray.printArray(a);
	}
}
/*
  row=5
  col=5
  
1	2	3	4	5		00	01	02	03	04
16	17	18	19	6		10	11	12	13	14
15 	24	25	20	7		20	21	22	23	24
14 	23	22	21	8		30	31	32	33	34
13 	12	11	10	9		40	41	42	43	44
  				
*/	