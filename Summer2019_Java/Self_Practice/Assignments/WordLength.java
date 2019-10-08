package Assignments;

import java.util.Scanner;

public class WordLength {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter first word: ");
		String word1=scan.nextLine();
		System.out.print("Please enter second word: ");
		String word2=scan.nextLine();
		System.out.print("Please enter third word: ");
		String word3=scan.nextLine();
		
		int length1=word1.length();
		int length2=word2.length();
		int length3=word3.length();
		
		if(length1==length2 && length1==length3 && length2==length3) {
			System.out.println("All words are same length.");
		}
		else if (length1==length2 || length1==length3 || length2==length3) {
			System.out.println("Not Same nor Different lengths.");
		}
		else {
			System.out.println("All different length.");
		}
			
	}

}
