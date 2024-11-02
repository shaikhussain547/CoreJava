package BasicJava;

public class MultiDimensionalArray {
	
	//Multi-dimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays.
	
	public static void main(String[] args) {	
		String x[][] = new String[3][5];
		
		System.out.println(x.length); //3 -- Total no. of rows
		System.out.println(x[0].length);//5 -- Total no. of columns
		//1st Row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		//2nd Row
		x[1][0] = "F";
		x[1][1] = "G";
		x[1][2] = "H";
		x[1][3] = "I";
		x[1][4] = "J";
		//3rd Row
		x[2][0] = "K";
		x[2][1] = "L";
		x[2][2] = "M";
		x[2][3] = "N";
		x[2][4] = "O";

		System.out.println(x[1][2]);	
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.print(x[row][col]+" ");
			}
			System.out.println();
		}
	
		System.out.println();
		
		for(String[]  rows : x) {
			 for(String row : rows) {
				 System.out.print(row+" ");
			 }
			 System.out.println();
		}
		
		int[][] arr = {{10,20,30},{40,50,60}};
		
		//Retrive all values from 2-D array
		
		for(int[] row : arr) {
			
			for(int i : row) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}
}
