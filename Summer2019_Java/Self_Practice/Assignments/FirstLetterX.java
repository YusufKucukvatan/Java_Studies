package Assignments;

import java.util.Scanner;

public class FirstLetterX {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Please enter a word: ");
		String word=scan.nextLine().toLowerCase();
		
		if (word.charAt(0)=='x')
			word=word.substring(1);
		System.out.println(word);
		
}

}
