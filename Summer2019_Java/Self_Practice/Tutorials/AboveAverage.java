package Tutorials;

import java.util.Scanner;

public class AboveAverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the length of array: ");
		int length=scan.nextInt();
		
		int[] myList = new int[length];

		int sum = 0;
		int ave = 0;
		
		for (int i = 0; i < myList.length; i++) {
			System.out.println("Please enter the value for array: ");
			myList[i] = scan.nextInt();
			sum += myList[i];
		}
		ave = sum / myList.length;
		System.out.println("Average of the myList elements is " + ave);
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] > ave) {
				System.out.println(myList[i] + " is above the average...");
			}
		}

	}
}
