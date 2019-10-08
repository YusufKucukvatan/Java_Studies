package day23_Arrays;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter the word: ");
		String word = scan.nextLine();
		int count = 0;
		String unique = "";
		for (int i = 0; i < word.length(); i++) {
			count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == (word.charAt(j)))
					count++;
			}
			if (count == 1)
				unique += word.charAt(i);
		}
		System.out.println("unique characters in word are " + unique);
	}

}
