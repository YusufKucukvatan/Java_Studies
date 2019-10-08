package Assignments;

import java.util.Scanner;

public class MakeThemEqual {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter first word: ");
		String word1=scan.nextLine();
		System.out.print("Please enter second word: ");
		String word2=scan.nextLine();
		
		int length1=word1.length();
		int length2=word2.length();
		String word="";
		if (length1>length2)
			word=word1.substring(0,word2.length())+word2;
		else 
			word=word2.substring(0,word1.length())+word1;
		System.out.println(word);
	}

}
