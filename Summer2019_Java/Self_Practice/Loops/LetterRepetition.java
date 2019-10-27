package Loops;

import java.util.Scanner;

public class LetterRepetition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the word: ");
		String word = scan.nextLine();
		int length = word.length();
		for (char i = 'A'; i <= 'z'; i++) {
			int count = 0;
			for (int j = 0; j < length; j++) {
				if (word.charAt(j) == i) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("There are " + count + " times "+i);
			}
		}
	}
}
