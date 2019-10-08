package Tutorials;

import java.util.Arrays;
import java.util.Scanner;
public class ReverseNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] array=new int[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter number-"+i+": ");
			array[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(array));
		for (int i = array.length-1; i >=0 ; i--) {
			System.out.print(array[i]+" ");
		}
	}

}
