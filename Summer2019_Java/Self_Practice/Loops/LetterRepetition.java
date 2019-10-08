package Loops;

import java.util.Scanner;

public class LetterRepetition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the word: ");
		String word = scan.nextLine();
		int length = word.length();
		// char[] count=new char[127];
		for (char j = 'A'; j <= 'z'; j++) {
			int count = 0;
			for (int i = 0; i < length; i++) {
				if (word.charAt(i) == j) {
					count++;
				}

			}
			if (count > 1) {
				System.out.print("There are " + count + " times ");
				System.out.println(j);
			}
		}

	}

}
