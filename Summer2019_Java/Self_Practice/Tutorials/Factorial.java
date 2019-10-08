package Tutorials;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter number: ");
		int factorial=scan.nextInt();
		long result=1;
		for (int i = 1; i <= factorial; i++) {
			result*=i;
		}
		System.out.println(factorial+"! is "+result);
	}
}
