package ArraysSingleDimensional;

import java.util.Scanner;

public class IncludesSameLetters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter first word: ");
		String str1 = scan.nextLine();
		System.out.print("Please enter first word: ");
		String str2 = scan.nextLine();
		boolean result=true;
		for (int i = 0; i < str1.length(); i++) {
			int count = 0;
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					count++;
				}
			}
			if (count == 0) {
				result=false;
				break;
			}
		}
		System.out.println(result);
	}
}
