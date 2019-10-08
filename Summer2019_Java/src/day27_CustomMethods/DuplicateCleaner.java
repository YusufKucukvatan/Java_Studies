package day27_CustomMethods;

import java.util.Scanner;

public class DuplicateCleaner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the word: ");
		String word = scan.nextLine();
		cleanDuplicate1(word);
		cleanDuplicate2(word);

	}

	private static void cleanDuplicate1(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < str.length() - 1; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 0)
				result = result + str.charAt(i);
		}
		System.out.println(result);
	}

	private static void cleanDuplicate2(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (!result.contains(str.substring(i, i + 1))) {
				result += str.substring(i, i + 1);
			}
		}
		System.out.println(result);
	}
}
