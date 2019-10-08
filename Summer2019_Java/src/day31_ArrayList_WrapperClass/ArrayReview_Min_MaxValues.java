package day31_ArrayList_WrapperClass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview_Min_MaxValues {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("How many numbers you want to add: ");
		int length=scan.nextInt();
		int[] numbers=new int[length];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Please enter a number: ");
			numbers[i]=scan.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
			if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		System.out.println("Maximum value of the array is "+max);
		System.out.println("Minimum value of the array is "+min);
		
	}
}
