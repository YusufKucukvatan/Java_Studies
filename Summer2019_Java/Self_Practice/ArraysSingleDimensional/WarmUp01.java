package ArraysSingleDimensional;

import java.util.Scanner;

public class WarmUp01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("please enter 5 numbers consecutively: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int[] myList = new int[20];

		int sum = 0;
		int ave = 0;
		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int) (Math.random() * 100);
			sum += myList[i];
			ave = sum / (i + 1);
		}
		System.out.println("Average of the myList elements is " + ave);
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] > ave) {
				System.out.println(myList[i] + " is above the average...");
			}
		}

	}

}
