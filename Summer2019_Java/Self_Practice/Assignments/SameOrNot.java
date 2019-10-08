package Assignments;

import java.util.Scanner;

public class SameOrNot {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the word: ");
		String word=scan.nextLine().toLowerCase();
		
		boolean same=word.charAt(0)==word.charAt(word.length()-1);
		
		if (same)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
