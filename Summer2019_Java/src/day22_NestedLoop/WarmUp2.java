package day22_NestedLoop;

import java.util.Scanner;

public class WarmUp2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String str=scan.nextLine();
		String reverse="";
		int length=str.length();
		int i=0;
		while(i<length) {
			if(str.charAt(i)!=(str.charAt(length-1-i))) {
				System.out.println("This word is not a palindrome...");
				break;
			}
			reverse+=str.charAt(length-1-i);
			i++;
		}
		if(str.equals(reverse)) {
			System.out.println(str+" is a palindrome word.");
		}
		
	}

}
