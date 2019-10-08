package day31_ArrayList_WrapperClass;

import java.util.Arrays;

public class ArrayReview {
	public static void main(String[] args) {
		
		int[]numbers= {200,3000,20,7880,40,-9,-100};
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[j]>numbers[i]) {
					int temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		
		
	}
}
