package ArraysMultiDimensional;

public class TwoDimensionArrays {
public static void main(String[] args) {
	int[][] matrix=null;
	matrix=new int[10][10];
	matrix[2][3]=7;
	for (int row= 0; row < matrix.length; row++) {
		for (int column = 0; column < matrix.length; column++) {
			matrix[row][column]=(int)(Math.random()*100);
			System.out.printf("%4d",matrix[row][column]);
		}
		System.out.println();
	}
	int sum=0;
	for (int row = 0; row < matrix.length; row++) {
		for (int column = 0; column < matrix.length; column++) {
			sum+=matrix[row][column];
		}
	}
	System.out.println();
	System.out.println("Sum of the numbers in matrix is: "+sum);
	System.out.println();
	
	int sumOfColumn=0;
	for (int column = 0; column < matrix.length; column++) {
		sumOfColumn=0;
		for (int row = 0; row < matrix.length; row++) {
			sumOfColumn+=matrix[row][column];
	}
		System.out.println("Sum of the numbers in Column-"+column+" is: "+sumOfColumn);
	}	
	System.out.println();
	
	int sumOfRow=0;
	int largestSumOfRow=0;
	int largestRowNumber=-1;
	for (int row = 0; row < matrix.length; row++) {
		sumOfRow=0;
		for (int column = 0; column < matrix.length; column++) {
			sumOfRow+=matrix[row][column];
			}
		if(sumOfRow>largestSumOfRow) {
			largestSumOfRow=sumOfRow;
			largestRowNumber=row;
		}
	}
	System.out.println("Largest row in the matrix is Row-"+largestRowNumber+" and sum is "+largestSumOfRow);
	
}
}
