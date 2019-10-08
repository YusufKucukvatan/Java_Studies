package Assignments;

import java.util.Scanner;

public class SameOrNot_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter first word: ");
		String word1 = scan.nextLine();
		System.out.print("Please enter second word: ");
		String word2 = scan.nextLine();

		if (word1.charAt(0) == word2.charAt(word2.length() - 2)) {
			if (word1.charAt(1) == word2.charAt(word2.length() - 1)) {
				System.out.println(true);
			}
		}
		else if (word1.charAt(0) == word2.charAt(word2.length() - 1)) {
			if (word1.charAt(1) == word2.charAt(word2.length() - 2)) {
				System.out.println(true);
			}
		} else {
			System.out.println(false);

		}

	}
}
