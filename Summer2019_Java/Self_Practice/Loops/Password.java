package Loops;

import java.util.Scanner;

public class Password {

	/*
	 * Please identify a password which: - has an Upper Case first character, -
	 * includes at least a lower case character, - includes between 8 and 20
	 * characters, - includes at least a special character, - includes at least a
	 * number, - you
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter your password: ");
		String password = scan.nextLine();

		boolean length = 8 <= password.length() && password.length() <= 20;

		boolean firstChar = 'A' <= password.charAt(0) && password.charAt(0) <= 'Z';

		int special = 0;
		int number = 0;
		int lowerCase = 0;
		int upperCase = 0;
		

		char s = '!'; // Special characters starts at 33 on ASCII Table.
		int n = '0'; // Numbers starts at 48 on ASCII Table.
		int l = 'a'; // Lower case characters starts at 97 on ASCII Table.
		int u = 'A'; // Upper case characters starts at 65 on ASCII Table.

		while (s <= '/') {
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) == s) { // =============> Checks if any character of password intercepts with a
												// special character.
					special++;
				}
				if (special > 0) {
					break;
				}
			}
			s++;
		}
		while (n <= '9') {
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) == n) { // =============> Checks if any character of password intercepts with a
												// number.
					number++;
				}
				if (number > 0) {
					break;
				}
			}
			n++;
		}

		while (u <= 'Z') {
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) == u) { // =============> Checks if any character of password intercepts with an
												// upper character.
					upperCase++;
				}
				if (upperCase > 0) {
					break;
				}
			}
			u++;
		}

		while (l <= 'z') {
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) == l) { // =============> Checks if any character of password intercepts with a
												// lower case character.
					lowerCase++;
				}
				if (lowerCase > 0) {
					break;
				}
			}
			l++;
		}

		if (!length) {
			System.err.println("\nPlease enter between 8 and 20 characters in password.");
		}
		if (!firstChar) {
			System.err.println("\nPlease enter the first character in UPPER CASE.");
		}
		if (special == 0) {
			System.err.println("\nPlease enter at least a special character in password.");
		}
		if (number == 0) {
			System.err.println("\nPlease enter at least a number in password.");
		}
		if (lowerCase == 0) {
			System.err.println("\nPlease enter at least a lower case character in password.");
		}
		if (upperCase == 0) {
			System.err.println("\nPlease enter at least an upper case character in password.");
		}
		if (!length || !firstChar || special == 0 || number == 0 || lowerCase == 0 || upperCase == 0) {
			System.err.println("\nYour password is not valid. Please try again...");

		} else {
			System.out.println("\nCongratulations, your password is valid.");

		}
	}

}