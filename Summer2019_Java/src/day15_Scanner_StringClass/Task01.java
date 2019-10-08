package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Please enter the second number: ");
		int num2 = input.nextInt();
		
		System.out.println("The Sum of first and second number is "+(num1+num2));
	}
}
