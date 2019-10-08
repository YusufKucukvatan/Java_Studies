package Assignments;

import java.util.Scanner;

public class StartEndWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first 5 letter word: ");
		String word1 = scan.nextLine();
		System.out.println("Please enter first 5 letter word: ");
		String word2 = scan.nextLine();

		int length1 = word1.length();
		int length2 = word2.length();

		if (length1 != 5 || length2 != 5) {
			System.err.println("Words need to be exactly 5 characters length!");
		}
		else {
			if (word1.charAt(4) == word2.charAt(0)) {
				System.out.println("Fizz!");
			} else {
				System.out.println("Buzz - did not match!");
			}
		}

	}
}