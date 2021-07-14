package twoD;

public class JaggedArray {

	public static void main(String[] args) {
		int a[][] = {
						{1,2,3},
						{4,5},
						{6,7,8,9}
					};
		System.out.println("total number of row = "+a.length);
		System.out.println("length of 1st row = "+a[0].length);
		System.out.println("length of 2nd row = "+a[1].length);
		System.out.println("length of 3rd row = "+a[2].length);
		System.out.println("1st number = "+a[0][0]);
		System.out.println("last number = "+a[a.length-1][a[a.length-1].length-1]);
		TestArray.printArray(a);
	}

}
