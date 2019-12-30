package day23_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {

		int[] arr = { 3, 17, 25, 39, 18, 13, 29, 25 };
		int sum = 42;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println("Sum of "+arr[i]+" and "+arr[j]+" is 42.");
				}
			}
		}
		int[][] x= {{1,2},{1,2,3,},{4,5,6,7,8,}};
		System.out.println(Arrays.deepToString(x));
		
	}
}
