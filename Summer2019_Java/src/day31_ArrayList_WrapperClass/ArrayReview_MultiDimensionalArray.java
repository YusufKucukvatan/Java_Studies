package day31_ArrayList_WrapperClass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview_MultiDimensionalArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("What is the length of array: ");
		int length=scan.nextInt();
		System.out.print("What is the element number for each array: ");
		int element=scan.nextInt();
		int[][] arr2=new int[length][element];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println("Please enter the value of the element arr["+i+"]["+j+"]: ");
				arr2[i][j]=scan.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr2));
	}

}
