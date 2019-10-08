package Tutorials;

import java.util.Arrays;
import java.util.Scanner;

public class CountOccurence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array=new int[20];
		int k=0;
		while(k<20) {
			System.out.print("Please enter number-" + k + ": ");
			array[k]=scan.nextInt();
			if(array[k]==0) {
				break;
			}
			k++;
		}
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			count = 1;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			System.out.println(array[i] + " occurs " + count + " times.");
		}
	}

}
