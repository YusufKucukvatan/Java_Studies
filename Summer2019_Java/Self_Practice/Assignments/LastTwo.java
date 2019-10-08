package Assignments;

import java.util.Scanner;

public class LastTwo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String word=scan.nextLine();
		
		if (word.length()>=2)
			System.out.println(word.substring(0,word.length()-2)+word.charAt(word.length()-1)+word.charAt(word.length()-2));
	}

}
