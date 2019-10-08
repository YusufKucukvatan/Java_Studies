package day16_;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first and  last name: \nFirst name: ");
		String firstname = input.nextLine().toUpperCase();
		System.out.print("Last name: ");
		String lastname = input.nextLine().toUpperCase();
		System.out.println((firstname.concat(" ").concat(lastname)));
	
	}
}
