package ArraysSingleDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class SortDescending {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the length of array: ");
		int length=scan.nextInt();
		int[] numbers=new int[length];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Please enter the value of numbers-"+i+": ");
			numbers[i]=scan.nextInt();
		}
		System.out.println("Thank yopu for inputs.");
		int temp=0;			
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[j]>numbers[i]) {
					temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;
				}
			}
		}
		System.out.println("Numbers in the order is: "+Arrays.toString(numbers));
	}

}
