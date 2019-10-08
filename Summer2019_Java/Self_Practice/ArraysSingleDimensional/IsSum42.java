package ArraysSingleDimensional;

import java.util.ArrayList;

public class IsSum42 {
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
	}
}
