package Assignments;

import java.util.Scanner;

public class SameMiddleCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first word: ");
		String word1 = scan.nextLine();
		System.out.println("Please enter second word: ");
		String word2 = scan.nextLine();

		

		if (word1.charAt(word1.length()-1) != word2.charAt(0)) {
			System.out.println(word1.concat(word2));
		}
		else {
			System.out.println(word1.concat(word2.substring(1)));
		}
}
}