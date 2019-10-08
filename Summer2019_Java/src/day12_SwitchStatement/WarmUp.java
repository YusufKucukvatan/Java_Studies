package day12_SwitchStatement;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter three positive number below: ");

		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();

		boolean valid = n1 > 0 && n2 > 0 && n3 > 0;
		boolean n1n2 = n1 == n2;
		boolean n1n3 = n1 == n3;
		boolean n2n3 = n2 == n3;
		boolean n1n2n3 = n1 == n2 & n1 == n3 && n2 == n3;

		String invalid = "At least one of the number you have entered is invalid for the system.\nPlease enter only positive numbers...";
		String n1n2eq = "The first and second number you have entered are equal.";
		String n1n3eq = "The first and third number you have entered are equal.";
		String n2n3eq = "The second and third number you have entered are equal.";
		String n1n2n3eq = "All numbers you have entered are equal.";
		String noneeq = "None of the numbers you have entered are equal.";

		if (valid) {
			if (n1n2n3) {
				System.out.println(n1n2n3eq);
			} else if (n1n2) {
				System.out.println(n1n2eq);
			} else if (n1n3) {
				System.out.println(n1n3eq);
			} else if (n2n3) {
				System.out.println(n2n3eq);
			} else {
				System.out.println(noneeq);
			}
		} else {
			System.out.println(invalid);
		}
System.out.println('B');
	}

}
