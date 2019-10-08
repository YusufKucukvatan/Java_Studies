package Assignments;

import java.util.Scanner;

public class middleCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter a word: ");
		String word = scan.nextLine();
		int length = word.length();
		int middle = (int)Math.ceil(length/2);
		String middleChar;
		
		if (length%2==0) {
			middleChar= word.substring(middle-1,middle+1); 
		}
		else {
			middleChar= word.substring(middle,middle+1); 
		}
		System.out.println("Middle character of the word is \'"+middleChar+"\'.");
	}

}
