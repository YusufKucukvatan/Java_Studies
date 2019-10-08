package ArraysSingleDimensional;

import java.util.Scanner;

public class ArraysPractice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter 5 consecutive number: ");
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(i + 1 + ". number: ");
			numbers[i] = scan.nextInt();
			System.out.println();
		}
		System.out.print("Number you have entered: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n");
		int[] reverse = new int[5];
		System.out.print("Reverse of the numbers array: ");
		for (int i = 0; i < numbers.length; i++) {
			reverse[i] = numbers[numbers.length - 1 - i];
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(reverse[i] + " ");
		}
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i; j < numbers.length; j++) {
				if (numbers[j] < numbers[i]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;

				}
			}
		}
		
		int sum = 0;
		System.out.println();
		System.out.print("Numbers in order: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			sum += numbers[i];
		}
		
		System.out.println();
		System.out.println("Sum of numbers: " + sum);
	}

}
