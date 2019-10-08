package Tutorials;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {

		int[] arr= {65,32,78,23,89};
				
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j]<arr[i]) {		
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
