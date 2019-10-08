package day15_Scanner_StringClass;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter a number between 0 to 9: ");
		int number = input.nextInt();
		
		String word;
		
		switch (number) {
			case 1:
				word = "one";
			break;
			case 2:
				word = "two";
			break;
			case 3:
				word = "three";
			break;
			case 4:
				word = "four";
			break;
			case 5:
				word = "five";
			break;
			case 6:
				word = "six";
			break;
			case 7:
				word = "seven";
			break;
			case 8:
				word = "eight";
			break;
			case 9:
				word = "nine";
			break;
			default:
			word = "invalid number";
		}
		System.out.println("You have entered: "+word);
		
		//////////////////////////////////////////////////
		//2nd Solution for Problem: Ternary
		
		System.out.print("Please enter a second number: ");
		int n = input.nextInt();
		
	
		String result2 = (n==9) ? "nine" : (n==8) ? "eight" //We can type all conditions in one line but it will be too long.
						:(n==7) ? "seven" : (n==6) ? "six"  //That is why we use multi line.
						:(n==5) ? "five" : (n==4) ? "four"  // The amount of ?s and amount of :s have to be the same...
						:(n==3) ? "three" : (n==2) ? "two"
						:(n==1) ? "one" : (n==0) ? "zero"
						: "invalid";
		System.out.println(result2);
	}
}
